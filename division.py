from fastapi import FastAPI
from pydantic import BaseModel

app = FastAPI()

class Operacion(BaseModel):
    num1: float
    num2: float

@app.post("/dividir")
def dividir(op: Operacion):
    if op.num2 != 0:
        return op.num1 / op.num2
    else:
        return "Error: División por cero"