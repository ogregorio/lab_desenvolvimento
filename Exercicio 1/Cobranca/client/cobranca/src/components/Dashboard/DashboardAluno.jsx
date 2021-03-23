import React, { useState, useEffect } from 'react'
import Disciplina from './Disciplina';

export default function DashboardAluno() {

    return (
        <div>
            <div className="card">
                <h1>Sistema do Aluno</h1>
                <a>Sua matricula: {sessionStorage.getItem('matricula')}</a>
                <div className="cursos">
                <Disciplina/>
                </div>
            </div>
        </div>
    )
}
