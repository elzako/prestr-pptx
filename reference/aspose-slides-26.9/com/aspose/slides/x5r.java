package com.aspose.slides;

class x5r extends com.aspose.slides.internal.v6g.h0<x5r> {
   private Object n5;
   private int l6;

   public x5r() {
      this.n5 = null;
      this.l6 = 0;
   }

   public final Object n5() {
      return this.n5;
   }

   public final int l6() {
      return this.l6;
   }

   private x5r(Object var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public static x5r k5() {
      return new x5r(null, 1);
   }

   public x5r(double var1) {
      this.n5 = var1;
      this.l6 = 1;
   }

   public x5r(boolean var1) {
      this.n5 = var1;
      this.l6 = 0;
   }

   public x5r(String var1) {
      this.n5 = var1;
      this.l6 = 2;
   }

   public x5r(a1h var1) {
      this.n5 = var1;
      this.l6 = 3;
   }

   public static x5r n5(r6t var0) {
      return new x5r(var0.u3(), n5(var0.c8()));
   }

   public final boolean n5(t8 var1) {
      if (this.n5() == null) {
         return false;
      }

      switch (this.l6()) {
         case 0:
            return com.aspose.slides.internal.v6g.k5.u3(this.n5(), boolean.class);
         case 1:
            return com.aspose.slides.internal.v6g.k5.u3(this.n5(), double.class) != 0.0;
         case 2:
            String var2 = com.aspose.slides.ms.System.d1.t2((String)this.n5());
            if ("FALSE".equals(var2)) {
               return false;
            } else {
               if ("TRUE".equals(var2)) {
                  return true;
               }

               throw new c1h("#VALUE!");
            }
         case 3:
            r6t var3 = this.n5(var1.n5(), (a1h)this.n5());
            if (var3 == null) {
               throw new c1h("#VALUE!");
            } else if (var3.c8() == 2) {
               throw new c1h(var3.u3().toString());
            } else {
               if (var3.a6() == null) {
                  throw new c1h("#VALUE!");
               }

               return var3.a6();
            }
         default:
            String var4 = "Unknown result type '{0}' is encountered in calculation.";
            throw new CellUnsupportedDataException(
               com.aspose.slides.ms.System.d1.n5(
                  "Unknown result type '{0}' is encountered in calculation.", new Object[]{com.aspose.slides.ms.System.s3.n5(v5n.class, this.l6())}
               )
            );
      }
   }

   public final int l6(t8 var1) {
      return this.n5() == null ? 0 : com.aspose.slides.internal.v6g.k5.u3(this.k5(var1), 14);
   }

   public final double k5(t8 var1) {
      if (this.n5() == null) {
         return 0.0;
      }

      switch (this.l6()) {
         case 0:
            return com.aspose.slides.internal.v6g.k5.u3(this.n5(), boolean.class) ? 1.0 : 0.0;
         case 1:
            return com.aspose.slides.internal.v6g.k5.u3(this.n5(), double.class);
         case 2:
            Double var2 = v4t.n5((String)this.n5(), var1.n5().n5().n5());
            if (var2 == null) {
               throw new c1h("#VALUE!");
            }

            return var2;
         case 3:
            r6t var3 = this.n5(var1.n5(), (a1h)this.n5());
            if (var3 == null) {
               throw new c1h("#VALUE!");
            } else if (var3.c8() == 2) {
               throw new c1h(var3.u3().toString());
            } else {
               if (var3.u9() == null) {
                  throw new c1h("#VALUE!");
               }

               return var3.u9();
            }
         default:
            String var4 = "Unknown result type '{0}' is encountered in calculation.";
            throw new CellUnsupportedDataException(
               com.aspose.slides.ms.System.d1.n5(
                  "Unknown result type '{0}' is encountered in calculation.", new Object[]{com.aspose.slides.ms.System.s3.n5(v5n.class, this.l6())}
               )
            );
      }
   }

   public final String u3(t8 var1) {
      if (this.n5() == null) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      switch (this.l6()) {
         case 0:
            return com.aspose.slides.ms.System.d1.t2(this.n5().toString());
         case 1:
            return com.aspose.slides.ms.System.d2.n5(com.aspose.slides.internal.v6g.k5.u3(this.n5(), double.class), com.aspose.slides.internal.x7n.l6.k5());
         case 2:
            return (String)this.n5();
         case 3:
            r6t var2 = this.n5(var1.n5(), (a1h)this.n5());
            if (var2 == null) {
               throw new c1h("#VALUE!");
            } else {
               if (var2.c8() == 2) {
                  throw new c1h(var2.u3().toString());
               }

               return var2.h0();
            }
         default:
            String var3 = "Unknown result type '{0}' is encountered in calculation.";
            throw new CellUnsupportedDataException(
               com.aspose.slides.ms.System.d1.n5(
                  "Unknown result type '{0}' is encountered in calculation.", new Object[]{com.aspose.slides.ms.System.s3.n5(v5n.class, this.l6())}
               )
            );
      }
   }

   public final x5r l6(r6t var1) {
      if (this.l6() != 3) {
         return this;
      }

      r6t var2 = this.n5(var1, (a1h)this.n5());
      if (var2 == null) {
         throw new c1h("#VALUE!");
      }

      Object var3 = var2.u3() == null && var2.c8() == 1 ? 0.0 : var2.u3();
      return new x5r(var3, n5(var2.c8()));
   }

   public final k1e a6(t8 var1) {
      if (this.l6() != 3) {
         return new v5b(this.u3(), var1);
      }

      u7j var2 = new u7j(var1.n5().n5());
      c6u var3 = ((a1h)this.n5()).n5(var2);
      return new l5b(var3, var1);
   }

   public static int n5(byte var0) {
      switch (var0) {
         case 0:
            return 0;
         case 1:
            return 1;
         case 2:
            throw new c1h("#VALUE!");
         case 3:
         case 4:
         case 5:
            return 2;
         default:
            String var1 = "Unknown cell type '{0}' is encountered in calculation.";
            throw new CellUnsupportedDataException(
               com.aspose.slides.ms.System.d1.n5(
                  "Unknown cell type '{0}' is encountered in calculation.",
                  new Object[]{com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.k4y.w1.class, var0)}
               )
            );
      }
   }

   final r6t k5(r6t var1) {
      return var1 == null ? null : this.n5(var1, (a1h)this.n5());
   }

   private r6t n5(r6t var1, a1h var2) {
      y9w var3 = var1.t2();
      y9w var4 = var2.l6(var3);
      return var4 == null ? null : var1.n5().n5().n5(var4.n5()).n5(var4.l6().l6(), var4.k5().l6());
   }

   public void n5(x5r var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public x5r u3() {
      x5r var1 = new x5r();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.u3();
   }

   private boolean l6(x5r var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5) && var1.l6 == this.l6;
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof x5r) ? false : this.l6((x5r)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public x5r Clone() {
      return this.u3();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(x5r bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
