package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

class q7g {
   public static final com.aspose.slides.internal.n8e.e2 n5 = new com.aspose.slides.internal.n8e.e2(
      "close", "moveTo", "lnTo", "arcTo", "quadBezTo", "cubicBezTo"
   );
   private long[] l6;
   private byte[] k5;
   private long u3;
   private long a6;
   private byte u9 = 1;
   private boolean h0 = true;
   private boolean c8 = true;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "close", "moveTo", "lnTo", "arcTo", "quadBezTo", "cubicBezTo"
   );

   public q7g(List<int[]> var1, long var2, long var4) {
      this.k5 = new byte[var1.size()];
      this.l6 = new long[var1.size() * 2];
      int var6 = 0;
      int var7 = 0;
      int[] var8 = new int[2];

      for (int var9 = 0; var9 < var1.size(); var9++) {
         if (var9 == 0) {
            this.k5[var6++] = 1;
         } else {
            this.k5[var6++] = 2;
         }

         var8 = (int[])var1.get_Item(var9);
         this.l6[var7++] = var8[0];
         this.l6[var7++] = var8[1];
      }

      this.u3 = var2;
      this.a6 = var4;
   }

   public final String n5(r8e[] var1, y2[] var2, String[] var3) {
      byte var4 = 0;
      String var5 = "";
      if (this.u9 == 0) {
         var5 = " F";
      }

      if (!this.h0) {
         var5 = com.aspose.slides.ms.System.d1.n5(var5, " S");
      }

      for (byte var9 : this.k5) {
         switch (var9) {
            case 0:
               var5 = com.aspose.slides.ms.System.d1.n5(var5, " Z");
               break;
            case 1:
               var5 = com.aspose.slides.ms.System.d1.n5(var5, " M");
               var5 = com.aspose.slides.ms.System.d1.n5(var5, com.aspose.slides.ms.System.d1.n5(new String[]{" ", u3k.n5(this.l6[var4], var1, var2, var3)}));
               var5 = com.aspose.slides.ms.System.d1.n5(var5, com.aspose.slides.ms.System.d1.n5(new String[]{" ", u3k.n5(this.l6[var4 + 1], var1, var2, var3)}));
               var4 += 2;
               break;
            case 2:
               var5 = com.aspose.slides.ms.System.d1.n5(var5, " L");
               var5 = com.aspose.slides.ms.System.d1.n5(var5, com.aspose.slides.ms.System.d1.n5(new String[]{" ", u3k.n5(this.l6[var4], var1, var2, var3)}));
               var5 = com.aspose.slides.ms.System.d1.n5(var5, com.aspose.slides.ms.System.d1.n5(new String[]{" ", u3k.n5(this.l6[var4 + 1], var1, var2, var3)}));
               var4 += 2;
               break;
            case 3:
               var4 += 4;
               break;
            case 4:
               var5 = com.aspose.slides.ms.System.d1.n5(var5, " Q");
               var5 = com.aspose.slides.ms.System.d1.n5(var5, com.aspose.slides.ms.System.d1.n5(new String[]{" ", u3k.n5(this.l6[var4], var1, var2, var3)}));
               var5 = com.aspose.slides.ms.System.d1.n5(var5, com.aspose.slides.ms.System.d1.n5(new String[]{" ", u3k.n5(this.l6[var4 + 1], var1, var2, var3)}));
               var5 = com.aspose.slides.ms.System.d1.n5(var5, com.aspose.slides.ms.System.d1.n5(new String[]{" ", u3k.n5(this.l6[var4 + 2], var1, var2, var3)}));
               var5 = com.aspose.slides.ms.System.d1.n5(var5, com.aspose.slides.ms.System.d1.n5(new String[]{" ", u3k.n5(this.l6[var4 + 3], var1, var2, var3)}));
               var4 += 4;
               break;
            case 5:
               var5 = com.aspose.slides.ms.System.d1.n5(var5, " C");
               var5 = com.aspose.slides.ms.System.d1.n5(var5, com.aspose.slides.ms.System.d1.n5(new String[]{" ", u3k.n5(this.l6[var4], var1, var2, var3)}));
               var5 = com.aspose.slides.ms.System.d1.n5(var5, com.aspose.slides.ms.System.d1.n5(new String[]{" ", u3k.n5(this.l6[var4 + 1], var1, var2, var3)}));
               var5 = com.aspose.slides.ms.System.d1.n5(var5, com.aspose.slides.ms.System.d1.n5(new String[]{" ", u3k.n5(this.l6[var4 + 2], var1, var2, var3)}));
               var5 = com.aspose.slides.ms.System.d1.n5(var5, com.aspose.slides.ms.System.d1.n5(new String[]{" ", u3k.n5(this.l6[var4 + 3], var1, var2, var3)}));
               var5 = com.aspose.slides.ms.System.d1.n5(var5, com.aspose.slides.ms.System.d1.n5(new String[]{" ", u3k.n5(this.l6[var4 + 4], var1, var2, var3)}));
               var5 = com.aspose.slides.ms.System.d1.n5(var5, com.aspose.slides.ms.System.d1.n5(new String[]{" ", u3k.n5(this.l6[var4 + 5], var1, var2, var3)}));
               var4 += 6;
         }
      }

      return com.aspose.slides.ms.System.d1.l6(var5);
   }

   public q7g(String var1, long var2, long var4) {
      com.aspose.slides.internal.r7c.u9 var6 = com.aspose.slides.internal.r7c.c8.l6(var1, "[mMZzLlHhVvCcSsQqTtAa][ 0-9?f-]*");
      char[] var7 = new char[]{' ', ','};
      char[] var8 = new char[var6.n5()];
      String[][] var9 = new String[var6.n5()][];
      int var10 = 0;
      int var11 = 0;

      for (int var12 = 0; var12 < var6.n5(); var12++) {
         var8[var12] = var6.n5(var12).k5().charAt(0);
         String var13 = com.aspose.slides.ms.System.d1.l6(
            com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(var6.n5(var12).k5(), 0, 1), "-", " -")
         );
         var9[var12] = com.aspose.slides.ms.System.d1.u9(var13, var7);
         switch (var8[var12]) {
            case 'A':
            case 'a':
               var10 += var9[var12].length / 6;
               var11 += var9[var12].length / 3;
            case 'B':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'I':
            case 'J':
            case 'K':
            case 'N':
            case 'O':
            case 'P':
            case 'R':
            case 'U':
            case 'W':
            case 'X':
            case 'Y':
            case '[':
            case '\\':
            case ']':
            case '^':
            case '_':
            case '`':
            case 'b':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'i':
            case 'j':
            case 'k':
            case 'n':
            case 'o':
            case 'p':
            case 'r':
            case 'u':
            case 'w':
            case 'x':
            case 'y':
            default:
               break;
            case 'C':
            case 'c':
               var10 += var9[var12].length / 6;
               var11 += var9[var12].length;
               break;
            case 'H':
            case 'h':
               var10 += var9[var12].length;
               var11 += var9[var12].length * 2;
               break;
            case 'L':
            case 'l':
               var10 += var9[var12].length / 2;
               var11 += var9[var12].length;
               break;
            case 'M':
            case 'm':
               var10 += var9[var12].length / 2;
               var11 += var9[var12].length;
               break;
            case 'Q':
            case 'q':
               var10 += var9[var12].length / 4;
               var11 += var9[var12].length;
               break;
            case 'S':
            case 's':
               var10 += var9[var12].length / 4;
               var11 += var9[var12].length + var9[var12].length / 4 * 2;
               break;
            case 'T':
            case 't':
               var10 += var9[var12].length / 2;
               var11 += var9[var12].length + var9[var12].length / 2 * 2;
               break;
            case 'V':
            case 'v':
               var10 += var9[var12].length;
               var11 += var9[var12].length * 2;
               break;
            case 'Z':
            case 'z':
               var10++;
         }
      }

      this.l6 = new long[var11];
      this.k5 = new byte[var10];
      var11 = 0;
      var10 = 0;
      long var14 = 0L;
      long var16 = 0L;

      for (int var26 = 0; var26 < var6.n5(); var26++) {
         var8[var26] = var6.n5(var26).k5().charAt(0);
         String var27 = com.aspose.slides.ms.System.d1.l6(
            com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(var6.n5(var26).k5(), 0, 1), "-", " -")
         );
         var9[var26] = com.aspose.slides.ms.System.d1.u9(var27, var7);
         switch (var8[var26]) {
            case 'A':
            case 'B':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'I':
            case 'J':
            case 'K':
            case 'N':
            case 'O':
            case 'P':
            case 'R':
            case 'U':
            case 'W':
            case 'X':
            case 'Y':
            case '[':
            case '\\':
            case ']':
            case '^':
            case '_':
            case '`':
            case 'a':
            case 'b':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'i':
            case 'j':
            case 'k':
            case 'n':
            case 'o':
            case 'p':
            case 'r':
            case 'u':
            case 'w':
            case 'x':
            case 'y':
            default:
               break;
            case 'C':
            case 'c':
               int var34 = 0;

               for (; var34 < var9[var26].length; var34++) {
                  if (var34 % 6 == 0) {
                     this.k5[var10++] = 5;
                     if (var34 != 0) {
                        var14 = this.l6[var11 - 2];
                        var16 = this.l6[var11 - 1];
                     }
                  }

                  if (var34 % 2 == 0) {
                     this.l6[var11++] = com.aspose.slides.ms.System.z3.a6(var9[var26][var34]) + (var8[var26] == 'C' ? 0L : var14);
                  } else {
                     this.l6[var11++] = com.aspose.slides.ms.System.z3.a6(var9[var26][var34]) + (var8[var26] == 'C' ? 0L : var16);
                  }
               }

               var14 = this.l6[var11 - 2];
               var16 = this.l6[var11 - 1];
               break;
            case 'H':
            case 'h':
               for (int var33 = 0; var33 < var9[var26].length; var33++) {
                  this.k5[var10++] = 2;
                  this.l6[var11++] = com.aspose.slides.ms.System.z3.a6(var9[var26][var33]) + (var8[var26] == 'H' ? 0L : var14);
                  var14 = this.l6[var11 - 1];
                  this.l6[var11++] = var16;
               }
               break;
            case 'L':
            case 'l':
               for (int var32 = 0; var32 < var9[var26].length; var32++) {
                  if (var32 % 2 == 0) {
                     this.k5[var10++] = 2;
                     this.l6[var11++] = com.aspose.slides.ms.System.z3.a6(var9[var26][var32]) + (var8[var26] == 'L' ? 0L : var14);
                     var14 = this.l6[var11 - 1];
                  } else {
                     this.l6[var11++] = com.aspose.slides.ms.System.z3.a6(var9[var26][var32]) + (var8[var26] == 'L' ? 0L : var16);
                     var16 += com.aspose.slides.ms.System.z3.a6(var9[var26][var32]);
                  }
               }
               break;
            case 'M':
            case 'm':
               for (int var31 = 0; var31 < var9[var26].length; var31++) {
                  if (var31 % 2 == 0) {
                     this.k5[var10++] = 1;
                     this.l6[var11++] = com.aspose.slides.ms.System.z3.a6(var9[var26][var31]) + (var8[var26] == 'M' ? 0L : var14);
                     var14 = this.l6[var11 - 1];
                  } else {
                     this.l6[var11++] = com.aspose.slides.ms.System.z3.a6(var9[var26][var31]) + (var8[var26] == 'M' ? 0L : var16);
                     var16 += com.aspose.slides.ms.System.z3.a6(var9[var26][var31]);
                  }
               }
               break;
            case 'Q':
            case 'q':
               for (int var30 = 0; var30 < var9[var26].length; var30++) {
                  if (var30 % 4 == 0) {
                     this.k5[var10++] = 4;
                     if (var30 != 0) {
                        var14 = this.l6[var11 - 2];
                        var16 = this.l6[var11 - 1];
                     }
                  }

                  if (var30 % 2 == 0) {
                     this.l6[var11++] = com.aspose.slides.ms.System.z3.a6(var9[var26][var30]) + (var8[var26] == 'Q' ? 0L : var14);
                  } else {
                     this.l6[var11++] = com.aspose.slides.ms.System.z3.a6(var9[var26][var30]) + (var8[var26] == 'Q' ? 0L : var16);
                  }
               }

               var14 = this.l6[var11 - 2];
               var16 = this.l6[var11 - 1];
               break;
            case 'S':
            case 's':
               for (int var29 = 0; var29 < var9[var26].length; var29++) {
                  if (var29 % 4 == 0) {
                     this.k5[var10++] = 5;
                     this.l6[var11++] = var14;
                     this.l6[var11++] = var16;
                     if (var29 != 0) {
                        var14 = this.l6[var11 - 2];
                        var16 = this.l6[var11 - 1];
                     }
                  }

                  if (var29 % 2 == 0) {
                     this.l6[var11++] = com.aspose.slides.ms.System.z3.a6(var9[var26][var29]) + (var8[var26] == 'S' ? 0L : var14);
                  } else {
                     this.l6[var11++] = com.aspose.slides.ms.System.z3.a6(var9[var26][var29]) + (var8[var26] == 'S' ? 0L : var16);
                  }
               }

               var14 = this.l6[var11 - 2];
               var16 = this.l6[var11 - 1];
               break;
            case 'T':
            case 't':
               for (int var28 = 0; var28 < var9[var26].length; var28++) {
                  if (var28 % 2 == 0) {
                     this.k5[var10++] = 4;
                     this.l6[var11++] = var14;
                     this.l6[var11++] = var16;
                     if (var28 != 0) {
                        var14 = this.l6[var11 - 2];
                        var16 = this.l6[var11 - 1];
                     }

                     this.l6[var11++] = com.aspose.slides.ms.System.z3.a6(var9[var26][var28]) + (var8[var26] == 'T' ? 0L : var14);
                  } else {
                     this.l6[var11++] = com.aspose.slides.ms.System.z3.a6(var9[var26][var28]) + (var8[var26] == 'T' ? 0L : var16);
                  }
               }

               var14 = this.l6[var11 - 2];
               var16 = this.l6[var11 - 1];
               break;
            case 'V':
            case 'v':
               for (int var18 = 0; var18 < var9[var26].length; var18++) {
                  this.k5[var10++] = 2;
                  this.l6[var11++] = var14;
                  this.l6[var11++] = com.aspose.slides.ms.System.z3.a6(var9[var26][var18]) + (var8[var26] == 'V' ? 0L : var16);
                  var16 += com.aspose.slides.ms.System.z3.a6(var9[var26][var18]);
               }
               break;
            case 'Z':
            case 'z':
               var10++;
         }
      }

      this.u3 = var2;
      this.a6 = var4;
   }

   public q7g(byte[] var1, long[] var2, long var3, long var5, byte var7, boolean var8, boolean var9) {
      this.u3 = var3;
      this.a6 = var5;
      this.k5 = var1;
      this.l6 = var2;
      this.u9 = var7;
      this.h0 = var8;
      this.c8 = var9;
   }

   public q7g(byte[] var1, List<Long> var2, int var3, int var4, long var5, long var7, byte var9, boolean var10, boolean var11) {
      this.u3 = var5;
      this.a6 = var7;
      this.k5 = var1;
      this.l6 = new long[var4];
      Long[] var12 = new Long[var4];
      var2.copyTo(var3, var12, 0, var4);

      for (int var13 = 0; var13 < var4; var13++) {
         this.l6[var13] = var12[var13];
      }

      this.u9 = var9;
      this.h0 = var10;
      this.c8 = var11;
   }

   public q7g(List<Byte> var1, List<Long> var2) {
      this.u3 = 0L;
      this.a6 = 0L;
      this.k5 = com.aspose.slides.internal.n8e.v4.l6(var1);
      this.l6 = com.aspose.slides.internal.n8e.v4.u9(var2);
   }

   public q7g() {
      this.u3 = 0L;
      this.a6 = 0L;
      this.k5 = new byte[0];
      this.l6 = new long[0];
   }

   public q7g(com.aspose.slides.internal.k4y.c7f var1, Dictionary<String, Integer> var2, List<r8e> var3) {
      int var4 = 0;
      int var5 = 0;

      for (com.aspose.slides.internal.k4y.g7 var9 : var1.u9()) {
         switch (t2.n5(var9.n5())) {
            case 0:
            default:
               break;
            case 1:
               var5 += 2;
               break;
            case 2:
               var5 += 2;
               break;
            case 3:
               var5 += 4;
               break;
            case 4:
               var5 += 4;
               break;
            case 5:
               var5 += 6;
         }

         var4++;
      }

      this.l6 = new long[var5];
      this.k5 = new byte[var4];
      var4 = 0;
      var5 = 0;

      for (com.aspose.slides.internal.k4y.g7 var33 : var1.u9()) {
         byte var10 = (byte)n5.n5(var33.n5());
         this.k5[var4++] = var10;
         switch (var10) {
            case 0:
            default:
               break;
            case 1:
               com.aspose.slides.internal.k4y.u1 var34 = ((com.aspose.slides.internal.k4y.p7x)var33.l6()).n5();
               this.l6[var5++] = n5(var34.n5(), var2, var3);
               this.l6[var5++] = n5(var34.l6(), var2, var3);
               break;
            case 2:
               com.aspose.slides.internal.k4y.u1 var11 = ((com.aspose.slides.internal.k4y.c1x)var33.l6()).n5();
               this.l6[var5++] = n5(var11.n5(), var2, var3);
               this.l6[var5++] = n5(var11.l6(), var2, var3);
               break;
            case 3:
               com.aspose.slides.internal.k4y.z6e var12 = (com.aspose.slides.internal.k4y.z6e)var33.l6();
               this.l6[var5++] = n5(var12.n5(), var2, var3);
               this.l6[var5++] = n5(var12.l6(), var2, var3);
               this.l6[var5++] = n5(var12.k5(), var2, var3);
               this.l6[var5++] = n5(var12.u3(), var2, var3);
               break;
            case 4:
               com.aspose.slides.internal.k4y.o6t var13 = (com.aspose.slides.internal.k4y.o6t)var33.l6();
               this.l6[var5++] = n5(var13.n5().n5(), var2, var3);
               this.l6[var5++] = n5(var13.n5().l6(), var2, var3);
               this.l6[var5++] = n5(var13.l6().n5(), var2, var3);
               this.l6[var5++] = n5(var13.l6().l6(), var2, var3);
               break;
            case 5:
               com.aspose.slides.internal.k4y.y8m var14 = (com.aspose.slides.internal.k4y.y8m)var33.l6();
               this.l6[var5++] = n5(var14.n5().n5(), var2, var3);
               this.l6[var5++] = n5(var14.n5().l6(), var2, var3);
               this.l6[var5++] = n5(var14.l6().n5(), var2, var3);
               this.l6[var5++] = n5(var14.l6().l6(), var2, var3);
               this.l6[var5++] = n5(var14.k5().n5(), var2, var3);
               this.l6[var5++] = n5(var14.k5().l6(), var2, var3);
         }
      }

      this.u3 = com.aspose.slides.internal.v6g.k5.u9(var1.n5() * 12700.0, 14);
      this.a6 = com.aspose.slides.internal.v6g.k5.u9(var1.l6() * 12700.0, 14);
      this.u9 = var1.k5();
      this.h0 = var1.u3();
      this.c8 = var1.a6();
   }

   private static long n5(String var0, Dictionary<String, Integer> var1, List<r8e> var2) {
      return u3k.n5(var0, var1, var2);
   }

   public final long[] n5() {
      return this.l6;
   }

   public final long l6() {
      return this.u3;
   }

   public final void n5(long var1) {
      this.u3 = var1;
   }

   public final long k5() {
      return this.a6;
   }

   public final void l6(long var1) {
      this.a6 = var1;
   }

   public final boolean u3() {
      return this.c8;
   }

   public final byte a6() {
      return this.u9;
   }

   public final void n5(byte var1) {
      this.u9 = var1;
   }

   public final boolean u9() {
      return this.h0;
   }

   public final void n5(boolean var1) {
      this.h0 = var1;
   }

   public final byte[] h0() {
      return this.k5;
   }

   public final GeometryPath n5(u3k var1, double[] var2, byte[] var3, float var4, float var5, float var6, float var7) {
      GeometryPath var8 = new GeometryPath(this.a6(), this.u9());
      double var9 = var4 / 12700.0;
      double var11 = var5 / 12700.0;
      int var13 = 0;
      float var14 = 0.0F;
      float var15 = 0.0F;
      long var16 = this.u3 > 0L ? this.u3 : 1L;
      long var18 = this.a6 > 0L ? this.a6 : 1L;
      double var20 = 7.874015748031496E-5;
      double var22 = 7.874015748031496E-5;
      if (this.u3 > 0L) {
         var20 = var6 / (float)var16 / 12700.0F;
      }

      if (this.a6 > 0L) {
         var22 = var7 / (float)var18 / 12700.0F;
      }

      for (byte var27 : this.k5) {
         switch (var27) {
            case 0:
               var8.closeFigure();
               break;
            case 1:
               var14 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var20 + var9);
               var15 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var22 + var11);
               var8.moveTo(var14, var15);
               break;
            case 2:
               float var54 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var20 + var9);
               float var56 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var22 + var11);
               var8.lineTo(var54, var56);
               break;
            case 3:
               float var30 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var20);
               float var31 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var22);
               float var32 = var1.l6(var2, var3, this.l6[var13++]);
               float var33 = var1.l6(var2, var3, this.l6[var13++]);
               var8.arcTo(var30, var31, var32, var33);
               break;
            case 4:
               float var53 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var20 + var9);
               float var55 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var22 + var11);
               float var57 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var20 + var9);
               float var58 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var22 + var11);
               var8.quadraticBezierTo(var53, var55, var57, var58);
               break;
            case 5:
               float var28 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var20 + var9);
               float var29 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var22 + var11);
               float var34 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var20 + var9);
               float var35 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var22 + var11);
               float var36 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var20 + var9);
               float var37 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var22 + var11);
               var8.cubicBezierTo(var28, var29, var34, var35, var36, var37);
         }
      }

      return var8;
   }

   public final com.aspose.slides.internal.x4g.s7 l6(u3k var1, double[] var2, byte[] var3, float var4, float var5, float var6, float var7) {
      com.aspose.slides.internal.x4g.s7 var8 = new com.aspose.slides.internal.x4g.s7();
      double var9 = var4 / 12700.0;
      double var11 = var5 / 12700.0;
      int var13 = 0;
      float var14 = 0.0F;
      float var15 = 0.0F;
      long var16 = this.u3 > 0L ? this.u3 : 1L;
      long var18 = this.a6 > 0L ? this.a6 : 1L;
      double var20 = 7.874015748031496E-5;
      double var22 = 7.874015748031496E-5;
      if (this.u3 > 0L) {
         var20 = var6 / (float)var16 / 12700.0F;
      }

      if (this.a6 > 0L) {
         var22 = var7 / (float)var18 / 12700.0F;
      }

      for (byte var27 : this.k5) {
         switch (var27) {
            case 0:
               var8.n3();
               break;
            case 1:
               var8.t9();
               var14 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var20 + var9);
               var15 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var22 + var11);
               break;
            case 2:
               float var63 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var20 + var9);
               float var66 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var22 + var11);
               var8.l6(var14, var15, var63, var66);
               var14 = var63;
               var15 = var66;
               break;
            case 3:
               float var30 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var20);
               float var31 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var22);
               float var32 = var1.l6(var2, var3, this.l6[var13++]);
               float var33 = var1.l6(var2, var3, this.l6[var13++]);
               if (!(com.aspose.slides.ms.System.q1.n5(var30) + com.aspose.slides.ms.System.q1.n5(var31) < 0.005)) {
                  var31 = var31 == 0.0F ? 1.0E-5F : var31;
                  var30 = var30 == 0.0F ? 1.0E-5F : var30;
                  double var34 = var32 / 180.0F * Math.PI;
                  if (var20 / var22 < 0.9999 || var20 / var22 > 1.0001) {
                     double var36 = (var32 + var33) / 180.0F * Math.PI;
                     double var38 = com.aspose.slides.ms.System.q1.c8(var34) * var20;
                     double var40 = com.aspose.slides.ms.System.q1.h0(var34) * var22;
                     var34 = com.aspose.slides.ms.System.q1.u3(var40, var38);
                     var32 = (float)(var34 * 180.0 / Math.PI);
                     var38 = com.aspose.slides.ms.System.q1.c8(var36) * var20;
                     var40 = com.aspose.slides.ms.System.q1.h0(var36) * var22;
                     var36 = com.aspose.slides.ms.System.q1.u3(var40, var38);
                     float var42 = (float)(var36 * 180.0 / Math.PI) - var32;
                     if (var33 < 0.0F && var42 > 0.0F) {
                        var33 = var42 - 360.0F;
                     } else if (var33 > 0.0F && var42 <= 0.0F) {
                        var33 = var42 + 360.0F;
                     } else {
                        var33 = var42;
                     }
                  }

                  double var70 = com.aspose.slides.ms.System.q1.c8(var34);
                  double var72 = com.aspose.slides.ms.System.q1.h0(var34);
                  double var74 = com.aspose.slides.ms.System.q1.z3(1.0 / (var70 * var70 / var30 / var30 + var72 * var72 / var31 / var31));
                  float var62 = (float)(var14 - var70 * var74);
                  float var65 = (float)(var15 - var72 * var74);
                  if (var33 == 0.0F) {
                     var33 = 360.0F;
                  }

                  var8.n5(var62 - var30, var65 - var31, var30 * 2.0F, var31 * 2.0F, var32, var33);
                  int var75 = var8.h0();
                  if (var75 < 2) {
                     var15 = 0.0F;
                     var14 = 0.0F;
                  } else {
                     com.aspose.slides.internal.o9b.w1 var43 = var8.a6()[var75 - 1].u3();
                     var14 = var43.l6();
                     var15 = var43.k5();
                  }
               }
               break;
            case 4:
               float var61 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var20 + var9);
               float var64 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var22 + var11);
               float var76 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var20 + var9);
               float var77 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var22 + var11);
               var8.n5(
                  var14,
                  var15,
                  var14 + (var61 - var14) * 2.0F / 3.0F,
                  var15 + (var64 - var15) * 2.0F / 3.0F,
                  var76 + (var61 - var76) * 2.0F / 3.0F,
                  var77 + (var64 - var77) * 2.0F / 3.0F,
                  var76,
                  var77
               );
               var14 = var76;
               var15 = var77;
               break;
            case 5:
               float var28 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var20 + var9);
               float var29 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var22 + var11);
               float var44 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var20 + var9);
               float var45 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var22 + var11);
               float var46 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var20 + var9);
               float var47 = (float)(var1.n5(var2, var3, this.l6[var13++]) * var22 + var11);
               var8.n5(var14, var15, var28, var29, var44, var45, var46, var47);
               var14 = var46;
               var15 = var47;
         }
      }

      return var8;
   }

   public final void n5(List<r8e> var1, byte[] var2) {
      int var3 = 0;
      a6m var4 = new a6m(this.u3, this.a6);

      for (byte var8 : this.k5) {
         switch (var8) {
            case 0:
            default:
               break;
            case 1:
            case 2:
               this.l6[var3] = var4.n5(var1, this.l6[var3], var2);
               this.l6[++var3] = var4.l6(var1, this.l6[var3], var2);
               var3++;
               break;
            case 3:
               this.l6[var3] = var4.k5(var1, this.l6[var3], var2);
               this.l6[++var3] = var4.u3(var1, this.l6[var3], var2);
               var3 = ++var3 + 2;
               break;
            case 4:
               this.l6[var3] = var4.n5(var1, this.l6[var3], var2);
               this.l6[++var3] = var4.l6(var1, this.l6[var3], var2);
               this.l6[++var3] = var4.n5(var1, this.l6[var3], var2);
               this.l6[++var3] = var4.l6(var1, this.l6[var3], var2);
               break;
            case 5:
               this.l6[var3] = var4.n5(var1, this.l6[var3], var2);
               this.l6[++var3] = var4.l6(var1, this.l6[var3], var2);
               this.l6[++var3] = var4.n5(var1, this.l6[var3], var2);
               this.l6[++var3] = var4.l6(var1, this.l6[var3], var2);
               this.l6[++var3] = var4.n5(var1, this.l6[var3], var2);
               this.l6[++var3] = var4.l6(var1, this.l6[var3], var2);
               var3++;
         }
      }

      this.u3 = this.a6 = 0L;
   }

   public q7g(String var1, long var2, long var4, j2x var6, Dictionary<String, Integer> var7, List<r8e> var8, Dictionary<String, Double> var9) {
      com.aspose.slides.internal.r7c.u9 var10 = com.aspose.slides.internal.r7c.c8.l6(var1, "[ABCFLMNQSTUVWXYZ][^ABCFLMNQSTUVWXYZ]+");
      char[] var11 = new char[]{' ', ','};
      char[] var12 = new char[var10.n5()];
      x1n var13 = new x1n(new String[var10.n5()][]);
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      int var17 = Integer.MIN_VALUE;
      boolean var18 = false;

      for (int var19 = 0; var19 < var10.n5(); var19++) {
         if (var16 && var15 && var14 && var17 == Integer.MIN_VALUE) {
            var17 = var19;
            break;
         }

         var12[var19] = var10.n5(var19).k5().charAt(0);
         var13.n5(
            var19, com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.k5(var10.n5(var19).k5(), 1)), var11)
         );
         switch (var12[var19]) {
            case 'A':
            case 'B':
            case 'V':
            case 'W':
               var18 = true;
            case 'C':
            case 'D':
            case 'E':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'X':
            case 'Y':
            default:
               break;
            case 'F':
               var16 = true;
               break;
            case 'N':
               var15 = true;
               break;
            case 'Z':
               var14 = true;
         }
      }

      List var20 = new List();
      List var21 = new List();
      double var22 = 0.0;
      double var24 = 0.0;
      double var26 = 0.0;
      double var28 = 0.0;
      boolean var30 = false;
      boolean var31 = false;
      long[] var32 = new long[]{16200000L, 16200000L, 5400000L, 5400000L};
      long[] var33 = new long[]{0L, 10800000L, 10800000L, 0L};
      double[] var34 = new double[var6.a6().length];
      byte[] var35 = new byte[var6.a6().length];
      if (var18) {
         byte[][] var36 = new byte[][]{var35};
         double[][] var37 = new double[][]{var34};
         var6.n5((float)var2, (float)var4, var36, var37);
         var35 = var36[0];
         var34 = var37[0];
      }

      u3k var64 = var6.n5();
      int var65 = 0;

      for (int var54 = 0; var54 < var10.n5(); var54++) {
         var12[var54] = var10.n5(var54).k5().charAt(0);
         var13.n5(
            var54, com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.k5(var10.n5(var54).k5(), 1)), var11)
         );
         if (var54 == var17) {
            break;
         }

         switch (var12[var54]) {
            case 'A':
            case 'B':
               List[] var73 = new List[]{var21};
               List[] var79 = new List[]{var20};
               double[] var84 = new double[]{var28};
               double[] var105 = new double[]{var26};
               this.n5(var73, var79, var84, var105, var13, var9, var54, (float)var2, (float)var4, false, var35, var34, var64);
               var21 = var73[0];
               var20 = var79[0];
               var28 = var84[0];
               var26 = var105[0];
               break;
            case 'C':
               for (int var72 = 0; var72 < var13.n5(var54).length; var72++) {
                  if (var72 % 6 == 0) {
                     var21.addItem((byte)5);
                  }

                  var20.addItem(u3k.n5(var13.n5(var54, var72), var7, var8));
               }
            case 'D':
            case 'E':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'N':
            case 'O':
            case 'P':
            case 'R':
            default:
               break;
            case 'F':
               this.u9 = 0;
               break;
            case 'L':
               for (int var71 = 0; var71 < var13.n5(var54).length; var71++) {
                  char var76 = var13.n5(var54, var71, 0);
                  var30 = var76 < '0' || var76 > '9';
                  if (var71 % 2 == 0) {
                     var21.addItem((byte)2);
                  }

                  var20.addItem(u3k.n5(var13.n5(var54, var71), var7, var8));
                  if (var71 % 2 == 0) {
                     var28 = var30 ? (Double)var9.get_Item(var13.n5(var54, var71)) : com.aspose.slides.ms.System.z3.u3(var13.n5(var54, var71));
                  } else {
                     var26 = var30 ? (Double)var9.get_Item(var13.n5(var54, var71)) : com.aspose.slides.ms.System.z3.u3(var13.n5(var54, var71));
                  }
               }
               break;
            case 'M':
               var21.addItem((byte)1);

               for (int var70 = 0; var70 < var13.n5(var54).length; var70++) {
                  char var75 = var13.n5(var54, var70, 0);
                  var30 = var75 < '0' || var75 > '9';
                  if (var70 > 1 && var70 % 2 == 0) {
                     var21.addItem((byte)2);
                  }

                  var20.addItem(u3k.n5(var13.n5(var54, var70), var7, var8));
                  String var78 = var13.n5(var54, var70);
                  if (var70 % 2 == 0) {
                     var28 = var30 && var9.containsKey(var78) ? (Double)var9.get_Item(var78) : com.aspose.slides.ms.System.z3.u3(var78);
                  } else {
                     var26 = var30 && var9.containsKey(var78) ? (Double)var9.get_Item(var78) : com.aspose.slides.ms.System.z3.u3(var78);
                  }
               }
               break;
            case 'Q':
               for (int var69 = 0; var69 < var13.n5(var54).length; var69++) {
                  if (var69 % 4 == 0) {
                     var21.addItem((byte)4);
                  }

                  var20.addItem(u3k.n5(var13.n5(var54, var69), var7, var8));
               }
               break;
            case 'S':
               this.h0 = false;
               break;
            case 'T':
            case 'U':
               for (int var68 = 0; var68 < var13.n5(var54).length; var68 += 6) {
                  com.aspose.slides.internal.o9b.w1 var77 = new com.aspose.slides.internal.o9b.w1((float)var28, (float)var26);
                  String var80 = var13.n5(var54, var68);
                  double var42 = 0.0;
                  double[] var44 = new double[]{0.0};
                  boolean var45 = com.aspose.slides.ms.System.d2.n5(var80, var44);
                  var42 = var44[0];
                  if (var45) {
                     var77.n5((float)var42);
                  } else {
                     Double var46 = 0.0;
                     Double[] var47 = new Double[]{var46};
                     boolean var48 = var9.tryGetValue(var80, var47);
                     var46 = var47[0];
                     if (var48) {
                        var77.n5(var46.floatValue());
                     }
                  }

                  var80 = var13.n5(var54, var68 + 1);
                  var44[0] = var42;
                  boolean var90 = com.aspose.slides.ms.System.d2.n5(var80, var44);
                  var42 = var44[0];
                  if (var90) {
                     var77.l6((float)var42);
                  } else {
                     Double var91 = 0.0;
                     Double[] var94 = new Double[]{var91};
                     boolean var49 = var9.tryGetValue(var80, var94);
                     var91 = var94[0];
                     if (var49) {
                        var77.l6(var91.floatValue());
                     }
                  }

                  com.aspose.slides.internal.o9b.f2 var93 = new com.aspose.slides.internal.o9b.f2(1.0F, 1.0F);
                  var80 = var13.n5(var54, var68 + 2);
                  var44[0] = var42;
                  boolean var95 = com.aspose.slides.ms.System.d2.n5(var80, var44);
                  var42 = var44[0];
                  if (var95) {
                     var93.n5((float)var42 * 2.0F);
                  } else {
                     Double var96 = 0.0;
                     Double[] var50 = new Double[]{var96};
                     boolean var51 = var9.tryGetValue(var80, var50);
                     var96 = var50[0];
                     if (var51) {
                        var93.n5(var96.floatValue() * 2.0F);
                     }
                  }

                  var80 = var13.n5(var54, var68 + 3);
                  var44[0] = var42;
                  boolean var98 = com.aspose.slides.ms.System.d2.n5(var80, var44);
                  var42 = var44[0];
                  if (var98) {
                     var93.l6((float)var42 * 2.0F);
                  } else {
                     Double var99 = 0.0;
                     Double[] var102 = new Double[]{var99};
                     boolean var52 = var9.tryGetValue(var80, var102);
                     var99 = var102[0];
                     if (var52) {
                        var93.l6(var99.floatValue() * 2.0F);
                     }
                  }

                  com.aspose.slides.internal.o9b.y1 var101 = new com.aspose.slides.internal.o9b.y1(
                     new com.aspose.slides.internal.o9b.w1(var77.l6() - var93.l6() / 2.0F, var77.k5() - var93.k5() / 2.0F), var93.a6()
                  );
                  List[] var103 = new List[]{var21};
                  List[] var104 = new List[]{var20};
                  this.n5(var101.y4(), 0.0F, 360.0F, true, var103, var104);
                  var21 = var103[0];
                  var20 = var104[0];
                  var28 = ((Long)var20.get_Item(var20.size() - 2)).longValue();
                  var26 = ((Long)var20.get_Item(var20.size() - 1)).longValue();
               }
               break;
            case 'V':
            case 'W':
               List[] var67 = new List[]{var21};
               List[] var40 = new List[]{var20};
               double[] var41 = new double[]{var28};
               double[] var53 = new double[]{var26};
               this.n5(var67, var40, var41, var53, var13, var9, var54, (float)var2, (float)var4, true, var35, var34, var64);
               var21 = var67[0];
               var20 = var40[0];
               var28 = var41[0];
               var26 = var53[0];
               break;
            case 'X':
               for (int var66 = 0; var66 < var13.n5(var54).length; var66++) {
                  char var74 = var13.n5(var54, var66, 0);
                  var30 = var74 < '0' || var74 > '9';
                  if (var66 % 2 == 0) {
                     var22 = var30 ? (Double)var9.get_Item(var13.n5(var54, var66)) : com.aspose.slides.ms.System.z3.u3(var13.n5(var54, var66));
                     var21.addItem((byte)3);
                     var65++;
                     var20.addItem(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.n5(var28 - var22), 14));
                  } else {
                     var24 = var30 ? (Double)var9.get_Item(var13.n5(var54, var66)) : com.aspose.slides.ms.System.z3.u3(var13.n5(var54, var66));
                     var20.addItem(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.n5(var26 - var24), 14));
                     var20.addItem(var65 <= 4 ? var32[var65 - 1] : var32[var65 % 4 - 1]);
                     var20.addItem((long)(var65 % 2 == 0 ? 5400000 : -5400000));
                  }
               }
               break;
            case 'Y':
               for (int var38 = 0; var38 < var13.n5(var54).length; var38++) {
                  char var39 = var13.n5(var54, var38, 0);
                  var30 = var39 < '0' || var39 > '9';
                  if (var38 % 2 == 0) {
                     var22 = var30 ? (Double)var9.get_Item(var13.n5(var54, var38)) : com.aspose.slides.ms.System.z3.u3(var13.n5(var54, var38));
                     var21.addItem((byte)3);
                     var65++;
                     var20.addItem(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.n5(var28 - var22), 14));
                     var31 = var22 < var28;
                  } else {
                     var24 = var30 ? (Double)var9.get_Item(var13.n5(var54, var38)) : com.aspose.slides.ms.System.z3.u3(var13.n5(var54, var38));
                     var20.addItem(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.n5(var26 - var24), 14));
                     var20.addItem(var65 <= 4 ? var33[var65 - 1] : var33[var65 % 4 - 1]);
                     var20.addItem((long)(var65 % 2 == 0 ? -5400000 : 5400000));
                  }
               }
               break;
            case 'Z':
               var21.addItem((byte)0);
         }
      }

      this.l6 = com.aspose.slides.internal.n8e.v4.u9(var20);
      this.k5 = com.aspose.slides.internal.n8e.v4.l6(var21);
      this.u3 = var2 != 0L ? var2 : 21600L;
      this.a6 = var4 != 0L ? var4 : 21600L;
   }

   private void n5(
      List<Byte>[] var1,
      List<Long>[] var2,
      double[] var3,
      double[] var4,
      x1n var5,
      Dictionary<String, Double> var6,
      int var7,
      float var8,
      float var9,
      boolean var10,
      byte[] var11,
      double[] var12,
      u3k var13
   ) {
      int var14 = 0;
      long[] var15 = new long[8];

      for (int var16 = 0; var16 < var5.n5(var7).length; var16++) {
         char var17 = var5.n5(var7, var16, 0);
         boolean var18 = var17 < '0' || var17 > '9';
         if (var18) {
            var15[var14++] = com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(n5(var6, var5.n5(var7, var16))), 14);
         } else {
            var15[var14++] = com.aspose.slides.ms.System.z3.u3(var5.n5(var7, var16));
         }
      }

      long var19 = (var15[2] - var15[0]) / 2L;
      long var21 = (var15[3] - var15[1]) / 2L;
      if (!(com.aspose.slides.ms.System.q1.n5(var19) + com.aspose.slides.ms.System.q1.n5(var21) < 0.005)) {
         if ((Byte)var1[0].get_Item(var1[0].size() - 1) == 1 && var10 && (var15[0] < 0L || var15[1] < 0L)) {
            var3[0] = com.aspose.slides.ms.System.q1.u3(var3[0] - var15[0]);
            var4[0] = com.aspose.slides.ms.System.q1.u3(var4[0] - var15[1]);
            var2[0].set_Item(var2[0].size() - 2, com.aspose.slides.internal.v6g.k5.u9(var3[0], 14));
            var2[0].set_Item(var2[0].size() - 1, com.aspose.slides.internal.v6g.k5.u9(var4[0], 14));
         }

         int var23 = this.n5(var15[0], var15[1], var15[2], var15[3], var15[4], var15[5]);
         if (!var10 && var23 == 0) {
            var23 = 360;
         }

         int var24 = this.n5(var15[0], var15[1], var15[2], var15[3], var15[6], var15[7]);
         if (var10 && var24 == 0) {
            var24 = 360;
         }

         int var25 = var24 - var23;
         if (var10 && var25 < 0) {
            var25 += 360;
         }

         float var26 = var13.n5(var12, var11, var19);
         float var27 = var13.n5(var12, var11, var21);
         float var28 = var13.n5(var12, var11, var23);
         float var29 = var13.n5(var12, var11, var25);
         double var30 = com.aspose.slides.ms.System.q1.c8(var28 * Math.PI / 180.0);
         double var32 = com.aspose.slides.ms.System.q1.h0(var28 * Math.PI / 180.0);
         double var34 = com.aspose.slides.ms.System.q1.z3(1.0 / (var30 * var30 / var26 / var26 + var32 * var32 / var27 / var27));
         float var36 = (float)(var3[0] - var30 * var34 - var26);
         float var37 = (float)(var4[0] - var32 * var34 - var27);
         if (var29 != 0.0F) {
            this.n5(new com.aspose.slides.internal.o9b.y1(var36, var37, var26 * 2.0F, var27 * 2.0F), var28, var29, false, var1, var2);
            var3[0] = ((Long)var2[0].get_Item(var2[0].size() - 2)).longValue();
            var4[0] = ((Long)var2[0].get_Item(var2[0].size() - 1)).longValue();
         }
      }
   }

   private void n5(com.aspose.slides.internal.o9b.y1 var1, float var2, float var3, boolean var4, List<Byte>[] var5, List<Long>[] var6) {
      com.aspose.slides.internal.x4g.s7 var7 = new com.aspose.slides.internal.x4g.s7();
      var7.n5(var1.y4(), var2, var3);
      com.aspose.slides.internal.o9b.w1[] var8 = var7.a6();
      int var9 = (var8.length - 1) / 3;
      if (var9 > 0 && var4) {
         var5[0].addItem((byte)1);
         var6[0].addItem(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(var8[0].l6()), 14));
         var6[0].addItem(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(var8[0].k5()), 14));
      }

      for (int var10 = 0; var10 < var9 * 3; var10 += 3) {
         var5[0].addItem((byte)5);
         var6[0].addItem(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(var8[1 + var10].l6()), 14));
         var6[0].addItem(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(var8[1 + var10].k5()), 14));
         var6[0].addItem(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(var8[2 + var10].l6()), 14));
         var6[0].addItem(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(var8[2 + var10].k5()), 14));
         var6[0].addItem(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(var8[3 + var10].l6()), 14));
         var6[0].addItem(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(var8[3 + var10].k5()), 14));
      }
   }

   private static double n5(Dictionary<String, Double> var0, String var1) {
      String var2 = w8s.k5(var1);
      return (Double)var0.get_Item(var2);
   }

   final void n5(byte[] var1, long[] var2) {
      List var3 = new List(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(this.k5))));
      List var4 = new List(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(this.l6))));
      if (var1 != null) {
         var3.addRange(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(var1))));
      }

      if (var2 != null) {
         var4.addRange(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(var2))));
      }

      this.k5 = com.aspose.slides.internal.n8e.v4.l6(var3);
      this.l6 = com.aspose.slides.internal.n8e.v4.u9(var4);
   }

   final int n5(long var1, long var3, long var5, long var7, long var9, long var11) {
      int[] var13 = new int[]{0, -180, 180, -360};
      int var14 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3((var5 + var1) / 2.0), 14);
      int var15 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3((var7 + var3) / 2.0), 14);
      byte var16 = 0;
      if (var9 > var14 && var11 >= var15) {
         var16 = 1;
      } else if (var9 <= var14 && var11 > var15) {
         var16 = 2;
      } else if (var9 < var14 && var11 <= var15) {
         var16 = 3;
      } else if (var9 >= var14 && var11 < var15) {
         var16 = 4;
      }

      var9 = com.aspose.slides.ms.System.q1.n5(var9);
      var11 = com.aspose.slides.ms.System.q1.n5(var11);
      float var17 = (float)com.aspose.slides.ms.System.q1.n5(var11 - var15);
      float var18 = (float)com.aspose.slides.ms.System.q1.n5(var9 - var14);
      if (var16 == 1 && var17 == 0.0F) {
         return 0;
      } else if (var16 == 2 && var18 == 0.0F) {
         return 90;
      } else if (var16 == 3 && var17 == 0.0F) {
         return 180;
      } else if (var16 == 4 && var18 == 0.0F) {
         return 270;
      } else {
         return var18 == 0.0F
            ? 0
            : com.aspose.slides.internal.v6g.k5.u3(
               com.aspose.slides.ms.System.q1.n5(
                  com.aspose.slides.ms.System.q1.u3(com.aspose.slides.ms.System.q1.t9(var17 / var18) * 180.0 / Math.PI + var13[var16 - 1])
               ),
               14
            );
      }
   }
}
