class Test2_3
{
static public void main(String ar[])
{

int i=1;
K:
{
System.out.printf("Softwaves_1");
System.out.printf("Softwaves_2");
if(i==1)continue K;
System.out.printf("Softwaves_3");
}
System.out.printf("Softwaves_4");

}

}


/* o/p=>

Test2_3.java:11: error: not a loop label: K
if(i==1)continue K;
        ^
1 error
         



*/