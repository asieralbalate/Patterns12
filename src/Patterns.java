public class Patterns {
    public static void main(String[] args) {
        printPatternA(8);
        System.out.println();
        printPatternB(8);
        System.out.println();
        printPatternC(8);
        System.out.println();
        printPatternD(8);
        System.out.println();
        printPatternE(8);
        System.out.println();
        printPatternF(8);
        System.out.println();
        printPatternG(8);
        System.out.println();
        printPatternH(8);
        System.out.println();
        printPatternI(8);
        System.out.println();
        printPatternJ(8);
        System.out.println();
        printPatternK(8);
        System.out.println();
        printPatternL(8);
        System.out.println();
        printPatternM(8);
        System.out.println();
        printPatternN(8);
        System.out.println();
        printPatternO(8);
        System.out.println();
        printPatternP(8);
        System.out.println();
        printPatternQ(8);
        System.out.println();
        printPatternR(8);
        System.out.println();
        printPatternS(8);
        System.out.println();
        printPatternT(8);
        System.out.println();
        printPatterU(8);


    }

    private static void printPatternA(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    private static void printPatternB(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    private static void printPatternC(int size) {
        for (int i = size; i >= 1; i--) {
            for (int g = i - 1; g < size-1; g++) {
                System.out.print("  ");
            }
            for (int h = i; h >= 1; h--) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    private static void printPatternD(int size) {
        for(int i = 1; i <= size ; i++) {
            for (int j = i ; j < size ; j++) {
                System.out.print("  ");
            }
            for (int j = size - i + 1; j <= size ; j++) {
                System.out.print(" #");
            }
            System.out.println();
        }


    }
    private static void printPatternE(int size) {
        for (int i = 1 ; i <= size ; i++) {
            for (int j = 1 ; j <= size ; j++) {
                if (i == 1 || j == 1 || i == size || j == size) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void printPatternF(int size) {
        for (int i = 1 ; i <= size ; i++) {
            for (int j = 1 ; j <= size ; j++) {
                if (i == 1 || i == size || i == j) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void printPatternG(int size) {
        for (int i = 1 ; i <= size ; i++) {
            for (int j = 1 ; j <= size ; j++) {
                if (i == 1 || i == size || i == size - j +1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void printPatternH(int size) {
        for (int i = 1 ; i <= size ; i++) {
            for (int j = 1 ; j <= size ; j++) {
                if (i == 1 || i == size || i == j || i == size - j +1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void printPatternI(int size) {
        for (int i = 1 ; i <= size ; i++) {
            for (int j = 1 ; j <= size ; j++) {
                if (i == 1 || i == size || i == j || i == size - j +1 || j == 1 || j == size) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void printPatternJ(int size) {
        for (int i = 1 ; i <= size ; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int g = i; g < size; g++) {
                System.out.print("# ");
            }
            for (int h = size; h >= i; h--) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    private static void printPatternK(int size) {
        for(int i = 1; i <= size ; i++) {
            for (int j = i ; j < size ; j++) {
                System.out.print("  ");
            }
            for (int j = size-i+1; j <= size ; j++) {
                System.out.print(" #");
            }
            for (int j = size-i+1; j < size ; j++) {
                System.out.print(" #");
            }
            System.out.println();
        }
    }
    private static void printPatternL(int size) {
        for(int i = 1; i <= size ; i++) {
            for (int j = i; j < size; j++) {
                System.out.print("  ");
            }
            for (int j = size - i + 1; j <= size; j++) {
                System.out.print("# ");
            }
            for (int j = size - i + 1; j < size; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        for (int i = 2 ; i <= size ; i++) {
            for (int j = 1; j < i ; j++) {
                System.out.print("  ");
            }
            for (int g = i - 1; g < size; g++) {
                System.out.print("# ");
            }
            for (int h = size; h > i ; h--) {
                System.out.print("# ");
            }
            System.out.println();
        }

    }
    private static void printPatternM(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    private static void printPatternN(int size) {
        for (int i = size; i >= 1; i--) {
            for (int g = i ; g < size; g++) {
                System.out.print("  ");
            }
            for (int h = i; h >=  1; h--) {
                System.out.print(i - h + 1  + " ");
            }
            System.out.println();
        }
    }
    private static void printPatternO(int size) {
        for(int i = 1; i <= size ; i++) {
            for (int j = i ; j < size ; j++) {
                System.out.print("  ");
            }
            for (int j = size - i + 1; j <= size ; j++) {
                System.out.print(size - j + 1 + " ");
            }
            System.out.println();
        }
    }
    private static void printPatternP(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i - j + + 1 +" ");
            }
            System.out.println();
        }
    }
    private static void printPatternQ(int size) {
        for(int i = 1; i <= size ; i++) {
            for (int j = i ; j < size ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            for (int j = i ; j > 1 ; j--) {
                System.out.print(j - 1 + " ");
            }
            System.out.println();
        }
    }
    private static void printPatternR(int size) {
        for(int i = size; i >= 1 ; i--) {
            for (int j = size ; j > i ; j--) {
                System.out.print("  ");
            }
            for (int j = 1 ; j <= i ; j++) {
                System.out.print(j + " ");
            }
            for (int j = i ; j > 1   ; j--) {
                System.out.print(j - 1 + " ");
            }
            System.out.println();
        }
    }
    private static void printPatternS(int size) {
        for(int i = 1; i <= size ; i++) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print(j+ " ");
            }
            for (int j = size ; j > i ; j--) {
                System.out.print("  ");
            }
            for (int j = i ; j < size-1  ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i ; j++) {
                if ( i - j + 1 != size) {
                    System.out.print(i - j + 1 + " ");
                }
            }
            System.out.println();
        }
    }
    private static void printPatternT(int size) {
        for (int i = 0; i <= size; i++) {
            for (int j = 1; j < size - i+1; j++) {
                System.out.print(j + " ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = size; j > i; j--) {
                if ( j-i  != size) {
                    System.out.print(j - i + " ");
                }
            }
            System.out.println();
        }
    }
    private static void printPatterU(int size) {
        for(int i = 1; i <= size ; i++) {
            for (int j = i ; j < size ; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i-1 ; j++) {
                if (i+j >= 10) {
                    System.out.print(i+j -10 + " ");
                } else {
                    System.out.print(i + j + " ");
                }
            }
            for (int j = i; j > 1; j--) {
                if (i + j - 2 >= 10) {
                    System.out.print(i + j - 12 + " ");
                } else {
                    System.out.print(i + j - 2 + " ");
                }
            }

            System.out.println();
        }
    }
}
