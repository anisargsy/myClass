
class MobileTester
{
    public static void main(String s[])
    {
        Mobile mobile = new Mobile("Samsung Wave", 2, 1024.0, true);

        System.out.print(mobile.model + " has " + mobile.numberOfSims + " sims and has a memory of " + mobile.memory + " MB.");
        System.out.println(mobile.hasCamera ? " It has a camera." : " It has no camera.");

    }
}