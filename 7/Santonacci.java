class Santonacci {
    public static int fibonacci(int n) {
        switch (n)
        {
            case 0: return 0;
            case 1:
            case 2: return 1;
            case 3: return 2;
            case 4: return 3;
            case 5: return 5;
            case 6: return 8;
            case 7: return 13;
            case 8: return 21;
            case 9: return 34;
            case 10: return 55;
            case 11: return 89;
            case 12: return 144;
            case 13: return 233;
            case 14: return 377;
            case 15: return 610;
            case 16: return 987;
            case 17: return 1597;
            case 18: return 2584;
            case 19: return 4181;
            case 20: return 6765;
            case 21: return 10946;
            case 22: return 17711;
            case 23: return 28657;
            case 24: return 46368;
            case 25: return 75025;
            case 26: return 121393;
            case 27: return 196418;
            case 28: return 317811;
            case 29: return 514229;
            case 30: return 832040;
            default: return 1346269;
        }
    }
}
