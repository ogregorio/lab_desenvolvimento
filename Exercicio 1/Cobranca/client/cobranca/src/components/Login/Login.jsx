import React, {useState} from 'react';
import {AD} from "../../Utils/Constants";
import './Login.css';

export default function Login() {

  const [matricula, setMatricula] = useState('');
  const [senha, setSenha] = useState('');
  const [tipo, setTipo] = useState({value: 'aluno'});

  function login(){
    tryLogin(tipo.value, matricula.value, senha.value);
  }

  async function tryLogin(tipo, matricula, senha) {
    console.log(tipo)
      if (await validMatricula(tipo, matricula, senha)) {
          sessionStorage.setItem('logged', 'true');
          sessionStorage.setItem('matricula', matricula);
          sessionStorage.setItem('tipo', tipo);
          window.location.href = '/dashboard'
      } else {
          alert('Usuário, senha ou tipo inválido!')
      }

  }

  async function validMatricula(tipo, matricula, senha) {
      const response = await getMatriculaDates(tipo, matricula, senha);
      if(response[0] !== undefined){
        return ((response[0].senha === senha) ? true : false);
      }else{
        return false
      }
  }

  async function getMatriculaDates(tipo, matricula) {
      return await fetch(AD + tipo + "?matricula=" + matricula)
      .then((resp) => resp.json())
      .catch((resp) => (resp.status === 404)? alert('Detectamos um erro 404!'):false)
  }

  return (
    <>
    <form action="#" class="login-form">
			<h1>Cobrança</h1>

      <label>Matricula</label>
			<div class="txtb">
				<input value={matricula.value} onChange={event => setMatricula({value: event.target.value})} id="matricula" type="text"/>
			</div>

      <label>Senha</label>
			<div class="txtb">
				<input value={senha.value} onChange={event => setSenha({value: event.target.value})} id="senha" type="password"/>
			</div>

      <label>Tipo</label>
      <div class="txtb">
        <select onChange={event => setTipo({value: event.target.value})} id="tipo" id="type">
          <option selected value="aluno">Aluno</option>
          <option value="professor">Professor</option>
        </select>
			</div>

			<input type="submit" class="logbtn" onClick={()=> login()} value="Login" />
		</form>
    </>
  );
}
