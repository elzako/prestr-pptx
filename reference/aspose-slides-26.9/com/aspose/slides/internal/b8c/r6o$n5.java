package com.aspose.slides.internal.b8c;

class r6o$n5 extends com.aspose.slides.internal.v6g.h0<r6o$n5> {
   public int n5;
   public int l6;
   public int k5;
   public int u3;
   public int a6;
   public int u9;
   public int h0;
   public int c8;
   public int t2;
   public int s7;
   public int x8;
   private String n3;
   private int y4;
   private static int[] e2 = new int[]{-1, 10, 100, 1000, 10000, 100000, 1000000};

   public r6o$n5() {
   }

   public final boolean n5(String var1, int var2) {
      this.n3 = var1;
      this.y4 = var1.length();
      int var3 = 0;

      while (var3 < this.y4 && com.aspose.slides.ms.System.t9.t9(var1.charAt(var3))) {
         var3++;
      }

      if (n5(var2, 773) && this.n5(var3)) {
         if (n5(var2, 1) && this.n5(var3 + r6o.x8(), 'T') && this.l6(var3 + r6o.n3())) {
            this.n5 = 0;
            return true;
         }

         if (n5(var2, 4) && this.u3(var3 + r6o.x8())) {
            this.n5 = 2;
            return true;
         }

         if (n5(var2, 512) && (this.u3(var3 + r6o.x8()) || this.n5(var3 + r6o.x8(), 'T') && this.l6(var3 + r6o.n3()))) {
            this.n5 = 8;
            return true;
         }

         if (n5(var2, 256)) {
            if (!this.n5(var3 + r6o.x8(), 'T')) {
               this.n5 = 8;
               return true;
            }

            if (this.k5(var3 + r6o.n3())) {
               this.n5 = 8;
               return true;
            }
         }
      }

      if (n5(var2, 2) && this.l6(var3)) {
         this.l6 = 1904;
         this.k5 = 1;
         this.u3 = 1;
         this.n5 = 1;
         return true;
      }

      if (n5(var2, 1024) && this.k5(var3)) {
         this.l6 = 1904;
         this.k5 = 1;
         this.u3 = 1;
         this.n5 = 1;
         return true;
      }

      if (n5(var2, 24)) {
         int[] var4 = new int[]{this.l6};
         boolean var5 = this.n5(var3, var4) && 1 <= var4[0];
         this.l6 = var4[0];
         if (var5) {
            if (n5(var2, 8)) {
               int[] var6 = new int[]{this.k5};
               boolean var7 = this.n5(var3 + r6o.y4(), '-') && this.l6(var3 + r6o.e2(), var6) && 1 <= var6[0] && var6[0] <= 12 && this.u3(var3 + r6o.t9());
               this.k5 = var6[0];
               if (var7) {
                  this.u3 = 1;
                  this.n5 = 3;
                  return true;
               }
            }

            if (n5(var2, 16) && this.u3(var3 + r6o.y4())) {
               this.k5 = 1;
               this.u3 = 1;
               this.n5 = 4;
               return true;
            }
         }
      }

      if (n5(var2, 160)) {
         int[] var8 = new int[]{this.k5};
         boolean var10 = this.n5(var3, '-') && this.n5(var3 + r6o.z1(), '-') && this.l6(var3 + r6o.t4(), var8) && 1 <= var8[0] && var8[0] <= 12;
         this.k5 = var8[0];
         if (var10) {
            if (n5(var2, 32) && this.n5(var3 + r6o.q0(), '-')) {
               int[] var12 = new int[]{this.u3};
               boolean var13 = this.l6(var3 + r6o.z3(), var12)
                  && 1 <= var12[0]
                  && var12[0] <= com.aspose.slides.ms.System.j5.n5(1904, this.k5)
                  && this.u3(var3 + r6o.m1());
               this.u3 = var12[0];
               if (var13) {
                  this.l6 = 1904;
                  this.n5 = 5;
                  return true;
               }
            }

            if (n5(var2, 128) && (this.u3(var3 + r6o.q0()) || this.n5(var3 + r6o.q0(), '-') && this.n5(var3 + r6o.z3(), '-') && this.u3(var3 + r6o.k7()))) {
               this.l6 = 1904;
               this.u3 = 1;
               this.n5 = 7;
               return true;
            }
         }
      }

      if (n5(var2, 64)) {
         int[] var9 = new int[]{this.u3};
         boolean var11 = this.n5(var3, '-')
            && this.n5(var3 + r6o.z1(), '-')
            && this.n5(var3 + r6o.t4(), '-')
            && this.l6(var3 + r6o.m3(), var9)
            && 1 <= var9[0]
            && var9[0] <= com.aspose.slides.ms.System.j5.n5(1904, 1)
            && this.u3(var3 + r6o.z8());
         this.u3 = var9[0];
         if (var11) {
            this.l6 = 1904;
            this.k5 = 1;
            this.n5 = 6;
            return true;
         }
      }

      return false;
   }

   private boolean n5(int var1) {
      int[] var2 = new int[]{this.l6};
      int[] var3 = new int[]{this.k5};
      int[] var4 = new int[]{this.u3};
      boolean var5 = this.n5(var1, var2)
         && 1 <= var2[0]
         && this.n5(var1 + r6o.y4(), '-')
         && this.l6(var1 + r6o.e2(), var3)
         && 1 <= var3[0]
         && var3[0] <= 12
         && this.n5(var1 + r6o.t9(), '-')
         && this.l6(var1 + r6o.j5(), var4)
         && 1 <= var4[0]
         && var4[0] <= com.aspose.slides.ms.System.j5.n5(var2[0], var3[0]);
      this.l6 = var2[0];
      this.k5 = var3[0];
      this.u3 = var4[0];
      return var5;
   }

   private boolean l6(int var1) {
      int[] var2 = new int[]{var1};
      boolean var3 = this.n5(var2);
      var1 = var2[0];
      return var3 && this.u3(var1);
   }

   private boolean k5(int var1) {
      int[] var2 = new int[]{var1};
      boolean var3 = this.n5(var2);
      var1 = var2[0];
      if (!var3) {
         return false;
      }

      while (var1 < this.y4) {
         var1++;
      }

      return var1 == this.y4;
   }

   private boolean n5(int[] var1) {
      int[] var2 = new int[]{this.a6};
      int[] var3 = new int[]{this.u9};
      int[] var4 = new int[]{this.h0};
      boolean var5 = this.l6(var1[0], var2)
         && var2[0] < 24
         && this.n5(var1[0] + r6o.w1(), ':')
         && this.l6(var1[0] + r6o.r4(), var3)
         && var3[0] < 60
         && this.n5(var1[0] + r6o.c4(), ':')
         && this.l6(var1[0] + r6o.y2(), var4)
         && var4[0] < 60;
      this.a6 = var2[0];
      this.u9 = var3[0];
      this.h0 = var4[0];
      if (!var5) {
         this.a6 = 0;
         return false;
      }

      var1[0] += r6o.y1();
      if (this.n5(var1[0], '.')) {
         this.c8 = 0;
         int var6 = 0;
         int var7 = 0;

         while (++var1[0] < this.y4) {
            int var8 = this.n3.charAt(var1[0]) - '0';
            if (9L < (var8 & 4294967295L)) {
               break;
            }

            if (var6 < 7) {
               this.c8 = this.c8 * 10 + var8;
            } else if (var6 == 7) {
               if (5 < var8) {
                  var7 = 1;
               } else if (var8 == 5) {
                  var7 = -1;
               }
            } else if (var7 < 0 && var8 != 0) {
               var7 = 1;
            }

            var6++;
         }

         if (var6 < 7) {
            if (var6 == 0) {
               return false;
            }

            this.c8 = this.c8 * e2[7 - var6];
         } else {
            if (var7 < 0) {
               var7 = this.c8 & 1;
            }

            this.c8 += var7;
         }
      }

      return true;
   }

   private boolean u3(int var1) {
      if (var1 < this.y4) {
         char var2 = this.n3.charAt(var1);
         if (var2 != 'Z' && var2 != 'z') {
            if (var1 + 5 < this.y4) {
               int[] var3 = new int[]{this.s7};
               int[] var4 = new int[]{this.x8};
               boolean var5 = this.l6(var1 + r6o.z1(), var3)
                  && var3[0] <= 99
                  && this.n5(var1 + r6o.a0(), ':')
                  && this.l6(var1 + r6o.d2(), var4)
                  && var4[0] <= 99;
               this.s7 = var3[0];
               this.x8 = var4[0];
               if (var5) {
                  if (var2 == '-') {
                     this.t2 = 2;
                     var1 += r6o.d5();
                  } else if (var2 == '+') {
                     this.t2 = 3;
                     var1 += r6o.d5();
                  }
               }
            }
         } else {
            this.t2 = 1;
            var1++;
         }
      }

      while (var1 < this.y4 && com.aspose.slides.ms.System.t9.t9(this.n3.charAt(var1))) {
         var1++;
      }

      return var1 == this.y4;
   }

   private boolean n5(int var1, int[] var2) {
      if (var1 + 3 < this.y4) {
         int var3 = this.n3.charAt(var1) - '0';
         int var4 = this.n3.charAt(var1 + 1) - '0';
         int var5 = this.n3.charAt(var1 + 2) - '0';
         int var6 = this.n3.charAt(var1 + 3) - '0';
         if (0 <= var3 && var3 < 10 && 0 <= var4 && var4 < 10 && 0 <= var5 && var5 < 10 && 0 <= var6 && var6 < 10) {
            var2[0] = ((var3 * 10 + var4) * 10 + var5) * 10 + var6;
            return true;
         }
      }

      return false;
   }

   private boolean l6(int var1, int[] var2) {
      if (var1 + 1 < this.y4) {
         int var3 = this.n3.charAt(var1) - '0';
         int var4 = this.n3.charAt(var1 + 1) - '0';
         if (0 <= var3 && var3 < 10 && 0 <= var4 && var4 < 10) {
            var2[0] = var3 * 10 + var4;
            return true;
         }
      }

      return false;
   }

   private boolean n5(int var1, char var2) {
      return var1 < this.y4 && this.n3.charAt(var1) == var2;
   }

   private static boolean n5(int var0, int var1) {
      return (var0 & var1) != 0;
   }

   public void n5(r6o$n5 var1) {
      var1 = var1 == null ? new r6o$n5() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
      var1.h0 = this.h0;
      var1.c8 = this.c8;
      var1.t2 = this.t2;
      var1.s7 = this.s7;
      var1.x8 = this.x8;
      var1.n3 = this.n3;
      var1.y4 = this.y4;
   }

   public r6o$n5 n5() {
      r6o$n5 var1 = new r6o$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(r6o$n5 var1) {
      return var1.n5 == this.n5
         && var1.l6 == this.l6
         && var1.k5 == this.k5
         && var1.u3 == this.u3
         && var1.a6 == this.a6
         && var1.u9 == this.u9
         && var1.h0 == this.h0
         && var1.c8 == this.c8
         && var1.t2 == this.t2
         && var1.s7 == this.s7
         && var1.x8 == this.x8
         && com.aspose.slides.ms.System.j8.n5(var1.n3, this.n3)
         && var1.y4 == this.y4;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof r6o$n5) ? false : this.l6((r6o$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public r6o$n5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(r6o$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
