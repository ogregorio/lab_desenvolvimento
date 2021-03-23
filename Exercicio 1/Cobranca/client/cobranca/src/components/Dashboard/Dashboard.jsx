import React from 'react'
import DashboardAluno from './DashboardAluno';
import DashboardProfessor from './DashboardProfessor';

export default function Dashboard() {
    let tipo = sessionStorage.getItem('tipo');
    if(tipo === "aluno"){
        return (<DashboardAluno/>)
    }else if (tipo === "professor"){
        return (<DashboardProfessor/>)
    }
}
