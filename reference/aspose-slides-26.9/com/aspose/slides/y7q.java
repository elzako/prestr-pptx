package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;

class y7q {
   private t8 n5;

   public y7q(t8 var1) {
      this.n5 = var1;
   }

   public final x5r n5(x5r var1, x5r var2) {
      String var3 = null;
      String[] var4 = new String[]{var3};
      int var5 = this.n5(var1.u3(), var2.u3(), var4);
      var3 = var4[0];
      if (com.aspose.slides.ms.System.d1.n5(var3)) {
         return new x5r(var5);
      } else {
         throw new c1h(var3);
      }
   }

   private int n5(x5r var1, x5r var2, String[] var3) {
      var3[0] = null;
      String var4 = "Unknown node result type '{0}' is encountered.";
      if (var1.l6() == 0) {
         if (var2.l6() == 0) {
            return this.n5(com.aspose.slides.internal.v6g.k5.u3(var1.n5(), boolean.class), com.aspose.slides.internal.v6g.k5.u3(var2.n5(), boolean.class));
         } else if (var2.l6() == 1) {
            return this.n5(com.aspose.slides.internal.v6g.k5.u3(var1.n5(), boolean.class), this.n5(var2.n5()).k5());
         } else if (var2.l6() == 2) {
            return this.n5(com.aspose.slides.internal.v6g.k5.u3(var1.n5(), boolean.class), (String)var2.n5());
         } else if (var2.l6() == 3) {
            return this.n5(com.aspose.slides.internal.v6g.k5.u3(var1.n5(), boolean.class), (a1h)var2.n5(), var3);
         } else {
            throw new CellUnsupportedDataException(
               com.aspose.slides.ms.System.d1.n5(
                  "Unknown node result type '{0}' is encountered.", new Object[]{com.aspose.slides.ms.System.s3.n5(v5n.class, var2.l6())}
               )
            );
         }
      } else if (var1.l6() == 1) {
         if (var2.l6() == 0) {
            return -this.n5(com.aspose.slides.internal.v6g.k5.u3(var2.n5(), boolean.class), this.n5(var1.n5()).k5());
         } else if (var2.l6() == 1) {
            return this.n5(this.n5(var1.n5()).k5(), this.n5(var2.n5()).k5());
         } else if (var2.l6() == 2) {
            return this.n5(this.n5(var1.n5()).k5(), (String)var2.n5());
         } else if (var2.l6() == 3) {
            return this.n5(this.n5(var1.n5()).k5(), (a1h)var2.n5(), var3);
         } else {
            throw new CellUnsupportedDataException(
               com.aspose.slides.ms.System.d1.n5(
                  "Unknown node result type '{0}' is encountered.", new Object[]{com.aspose.slides.ms.System.s3.n5(v5n.class, var2.l6())}
               )
            );
         }
      } else if (var1.l6() == 2) {
         if (var2.l6() == 0) {
            return -this.n5(com.aspose.slides.internal.v6g.k5.u3(var2.n5(), boolean.class), (String)var1.n5());
         } else if (var2.l6() == 1) {
            return -this.n5(this.n5(var2.n5()).k5(), (String)var1.n5());
         } else if (var2.l6() == 2) {
            return this.n5((String)var1.n5(), (String)var2.n5());
         } else if (var2.l6() == 3) {
            return this.n5((String)var1.n5(), (a1h)var2.n5(), var3);
         } else {
            throw new CellUnsupportedDataException(
               com.aspose.slides.ms.System.d1.n5(
                  "Unknown node result type '{0}' is encountered.", new Object[]{com.aspose.slides.ms.System.s3.n5(v5n.class, var2.l6())}
               )
            );
         }
      } else if (var1.l6() == 3) {
         if (var2.l6() == 0) {
            return -this.n5(com.aspose.slides.internal.v6g.k5.u3(var2.n5(), boolean.class), (a1h)var1.n5(), var3);
         } else if (var2.l6() == 1) {
            return -this.n5(this.n5(var2.n5()).k5(), (a1h)var1.n5(), var3);
         } else if (var2.l6() == 2) {
            return -this.n5((String)var2.n5(), (a1h)var1.n5(), var3);
         } else if (var2.l6() == 3) {
            return this.n5((a1h)var1.n5(), (a1h)var2.n5(), var3);
         } else {
            throw new CellUnsupportedDataException(
               com.aspose.slides.ms.System.d1.n5(
                  "Unknown node result type '{0}' is encountered.", new Object[]{com.aspose.slides.ms.System.s3.n5(v5n.class, var2.l6())}
               )
            );
         }
      } else {
         throw new CellUnsupportedDataException(
            com.aspose.slides.ms.System.d1.n5(
               "Unknown node result type '{0}' is encountered.", new Object[]{com.aspose.slides.ms.System.s3.n5(v5n.class, var1.l6())}
            )
         );
      }
   }

   private com.aspose.slides.ms.System.o5<Double> n5(Object var1) {
      if (var1 == null) {
         return new com.aspose.slides.ms.System.o5<>();
      }

      switch (com.aspose.slides.ms.System.z3.e2(var1)) {
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
            return new com.aspose.slides.ms.System.o5<>(com.aspose.slides.ms.System.z3.n3(var1));
         default:
            return new com.aspose.slides.ms.System.o5<>();
      }
   }

   private int n5(boolean var1, boolean var2) {
      if (var1) {
         return var2 ? 0 : 1;
      } else {
         return var2 ? -1 : 0;
      }
   }

   private int n5(boolean var1, com.aspose.slides.ms.System.o5<Double> var2) {
      if (var2.l6()) {
         return 1;
      } else {
         return var1 ? 1 : 0;
      }
   }

   private int n5(boolean var1, String var2) {
      return 1;
   }

   private int n5(boolean var1, a1h var2, String[] var3) {
      y9w var4 = var2.l6(this.n5.n5().t2());
      if (var4 == null) {
         var3[0] = "#VALUE!";
         return Integer.MIN_VALUE;
      } else {
         r6t var5 = this.n5.n5().n5().n5().n5(var4.n5()).n5(var4.l6().l6(), var4.k5().l6());
         return this.n5(var1, var5, var3);
      }
   }

   private int n5(com.aspose.slides.ms.System.o5<Double> var1, com.aspose.slides.ms.System.o5<Double> var2) {
      double var3 = var1.l6() ? (Double)var1.n5() : 0.0;
      double var5 = var2.l6() ? (Double)var2.n5() : 0.0;
      return com.aspose.slides.ms.System.q1.n5(var3 - var5) < 1.0E-15 ? 0 : (var3 < var5 ? -1 : 1);
   }

   private int n5(com.aspose.slides.ms.System.o5<Double> var1, String var2) {
      if (var1.l6()) {
         return -1;
      } else {
         return "".equals(var2) ? 0 : -1;
      }
   }

   private int n5(com.aspose.slides.ms.System.o5<Double> var1, a1h var2, String[] var3) {
      y9w var4 = var2.l6(this.n5.n5().t2());
      if (var4 == null) {
         var3[0] = "#VALUE!";
         return Integer.MIN_VALUE;
      } else {
         r6t var5 = this.n5.n5().n5().n5().n5(var4.n5()).n5(var4.l6().l6(), var4.k5().l6());
         return this.n5(var1.k5(), var5, var3);
      }
   }

   private int n5(String var1, String var2) {
      return com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.d1.u9(var1), com.aspose.slides.ms.System.d1.u9(var2));
   }

   private int n5(String var1, a1h var2, String[] var3) {
      y9w var4 = var2.l6(this.n5.n5().t2());
      if (var4 == null) {
         var3[0] = "#VALUE!";
         return Integer.MIN_VALUE;
      } else {
         r6t var5 = this.n5.n5().n5().n5().n5(var4.n5()).n5(var4.l6().l6(), var4.k5().l6());
         return this.n5(var1, var5, var3);
      }
   }

   private int n5(a1h var1, a1h var2, String[] var3) {
      y9w var4 = var1.l6(this.n5.n5().t2());
      if (var4 == null) {
         var3[0] = "#VALUE!";
         return Integer.MIN_VALUE;
      } else {
         y9w var5 = var2.l6(this.n5.n5().t2());
         if (var5 == null) {
            var3[0] = "#VALUE!";
            return Integer.MIN_VALUE;
         } else {
            r6t var6 = this.n5.n5().n5().n5().n5(var4.n5()).n5(var4.l6().l6(), var4.k5().l6());
            r6t var7 = this.n5.n5().n5().n5().n5(var5.n5()).n5(var5.l6().l6(), var5.k5().l6());
            return this.n5(var6, var7, var3);
         }
      }
   }

   private int n5(boolean var1, r6t var2, String[] var3) {
      var3[0] = null;
      if (var2.u3() == null) {
         return var1 ? 1 : 0;
      }

      switch (var2.c8()) {
         case 0:
            return this.n5(var1, com.aspose.slides.internal.v6g.k5.u3(var2.u3(), boolean.class));
         case 1:
            return this.n5(var1, this.n5(var2.u3()).k5());
         case 2:
            var3[0] = (String)var2.u3();
            return Integer.MIN_VALUE;
         case 3:
         case 4:
         case 5:
            return this.n5(var1, (String)var2.u3());
         default:
            throw new ArgumentException(
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  "Unexpected cell type ", com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.k4y.w1.class, var2.c8()), " is encountered."
               })
            );
      }
   }

   private int n5(com.aspose.slides.ms.System.o5<Double> var1, r6t var2, String[] var3) {
      var3[0] = null;
      switch (var2.c8()) {
         case 0:
            return -this.n5(com.aspose.slides.internal.v6g.k5.u3(var2.u3(), boolean.class), var1.k5());
         case 1:
            return this.n5(var1.k5(), this.n5(var2.u3()).k5());
         case 2:
            var3[0] = (String)var2.u3();
            return Integer.MIN_VALUE;
         case 3:
         case 4:
         case 5:
            return this.n5(var1.k5(), (String)var2.u3());
         default:
            throw new ArgumentException(
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  "Unexpected cell type ", com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.k4y.w1.class, var2.c8()), " is encountered."
               })
            );
      }
   }

   private int n5(String var1, r6t var2, String[] var3) {
      var3[0] = null;
      if (com.aspose.slides.ms.System.d1.n5(var1) && var2.u3() == null) {
         return 0;
      }

      switch (var2.c8()) {
         case 0:
            return -this.n5(com.aspose.slides.internal.v6g.k5.u3(var2.u3(), boolean.class), var1);
         case 1:
            return -this.n5(this.n5(var2.u3()).k5(), var1);
         case 2:
            var3[0] = (String)var2.u3();
            return Integer.MIN_VALUE;
         case 3:
         case 4:
         case 5:
            return this.n5(var1, (String)var2.u3());
         default:
            throw new ArgumentException(
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  "Unexpected cell type ", com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.k4y.w1.class, var2.c8()), " is encountered."
               })
            );
      }
   }

   private int n5(r6t var1, r6t var2, String[] var3) {
      var3[0] = null;
      switch (var1.c8()) {
         case 0:
            return this.n5(com.aspose.slides.internal.v6g.k5.u3(var1.u3(), boolean.class), var2, var3);
         case 1:
            return this.n5(this.n5(var1.u3()).k5(), var2, var3);
         case 2:
            var3[0] = (String)var1.u3();
            return Integer.MIN_VALUE;
         case 3:
         case 4:
         case 5:
            return this.n5((String)var1.u3(), var2, var3);
         default:
            throw new ArgumentException(
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  "Unexpected cell type ", com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.k4y.w1.class, var1.c8()), " is encountered."
               })
            );
      }
   }
}
