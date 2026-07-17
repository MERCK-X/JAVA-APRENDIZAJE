package com.merck;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicios
{
    //Constructor
    public Ejercicios() {}

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
    //Método mio -------------------------------------------------------------------------------------------------------
    public boolean Ej1Mio(int objetivo)
    {
        int ar1 []= {4,3,5,4};

        for(int i=0; i<ar1.length; i++)
        {
            for(int j=i+1; j<ar1.length; j++)
            {
                //Se prefiere crear una variable dentro del scope del lugar donde se va a usar, si se queda afuera, se queda en espera de uso y queda sin entender a donde pertenece
                int res=0;
                res = ar1[i] + ar1[j];

                if(res==objetivo)
                {
                    return true;
                }
            }
        }
        return false;
    }
    //Método correcto --------------------------------------------------------------------------------------------------
    public boolean Ej1Correcto(int objetivo)
    {
        int ar1[] = {4,3,5,4};
        Set<Integer> vistos = new HashSet<>();

        for (int i = 0; i < ar1.length; i++)
        {
            int complemento = objetivo - ar1[i];
            if (vistos.contains(complemento))
            {
                return true;
            }
            vistos.add(ar1[i]);
        }
        return false;
    }

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

    //Método mio -------------------------------------------------------------------------------------------------------
    public boolean Ej2Mio()
    {
        int ar1 []= {1,2,3,2};

        for(int i=0; i<ar1.length; i++)
        {
            for(int j=i+1; j<ar1.length; j++)
            {
                //Se prefiere crear una variable dentro del scope del lugar donde se va a usar, si se queda afuera, se queda en espera de uso y queda sin entender a donde pertenece
                if(ar1[i] == ar1[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
    //Método correcto --------------------------------------------------------------------------------------------------
    public boolean Ej2Correcto()
    {
        int ar1 []= {1,2,3,2};
        Set<Integer> vistos = new HashSet<>();

        for (int i = 0; i < ar1.length; i++)
        {
            if (vistos.contains(ar1[i]))
            {
                return true;
            }
            vistos.add(ar1[i]);
        }
        return false;
    }

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

    //Método mio -------------------------------------------------------------------------------------------------------
    public int Ej3Mio()
    {
        int[] ar1 = {2,4,3,2};
        HashMap<Integer, Integer> vistos = new HashMap<>();

        for(int i = 0; i < ar1.length; i++)
        {
            vistos.put(ar1[i], vistos.getOrDefault(ar1[i], 0) + 1);
        }
        for(int j = 0; j < ar1.length; j++)
        {
            if(vistos.get(ar1[j]) == 1)
            {
                return ar1[j];
            }
        }
        return -1;
    }
    //Método correcto --------------------------------------------------------------------------------------------------
    public void Ej3Correcto()
    {

    }
}
