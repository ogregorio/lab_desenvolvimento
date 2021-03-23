import React, {useEffect, useState} from 'react'
import {DB} from "../../Utils/Constants";

export default function Disciplina() {
    
    const [aluno, setAluno] = useState();
    const matricula = sessionStorage.getItem('matricula')

    useEffect(async () => {
        //request aluno data
        const aluno = await fetch(DB + "alunos" + "?matricula=" + matricula)
        .then((resp) => resp.json())
        .catch((resp) => (resp.status == 404) ? alert('Detectamos um erro 404!') : false);
        setAluno(aluno[0]);
    }, [])

    
    return (
        <div className="disciplina">
            {
                aluno &&
                <>
                {aluno.obrigatorias.map(function(object, i){
                            return <><a key={i}> {object} Valor: R$ 200</a><br/></>
                    })}
                {aluno.optativas.map(function(object, i){
                            return <><a key={i}> {object} Valor: R$ 200</a><br/></>
                    })}
                <a>Valor total: R$
                    {
                        (Object.keys(aluno.obrigatorias).length + Object.keys(aluno.optativas).length)*200
                    }
                </a>
                </>
            }
        </div>
    )
}
