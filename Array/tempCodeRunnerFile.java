int temp=arr[0];
        for(int i=1; i<size; i++)
        {
            arr[i-1]=arr[i];
            if(i==size-1)
            arr[i]=temp;
        }