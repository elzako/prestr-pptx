package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class p5c implements r6t {
   private b5v c8;
   private int t2;
   private int s7;
   private boolean x8;
   Object n5;
   byte l6;
   String k5;
   r6t u3;
   List<r6t> a6;
   com.aspose.slides.internal.k4y.h2d u9;
   boolean h0;
   private boolean n3;
   private Double y4;
   private int e2;

   @Override
   public final b5v n5() {
      return this.c8;
   }

   private void n5(b5v var1) {
      this.c8 = var1;
   }

   @Override
   public final int l6() {
      return this.t2;
   }

   final void l6(int var1) {
      this.t2 = var1;
   }

   @Override
   public final int k5() {
      return this.s7;
   }

   final void k5(int var1) {
      this.s7 = var1;
   }

   @Override
   public final Object u3() {
      if (this.n5().n5().n5()) {
         if (this.x8) {
            throw new CellCircularReferenceException("", this.n5(0, true));
         }

         this.r4();
      }

      if (this.n5 != null) {
         return this.n5;
      }

      if (this.y4 != null) {
         this.z8();
         return this.n5;
      }

      if (this.n5 == null) {
         this.z8();
      }

      return this.n5;
   }

   public final void n5(Object var1) {
      if (this.n5 != var1) {
         this.m1();
         this.l6(var1);
         if (this.l6 == 1 && com.aspose.slides.internal.v6g.k5.l6(var1, Double.class)) {
            this.n5 = this.n5(com.aspose.slides.internal.v6g.k5.u3(var1, double.class).doubleValue());
         } else {
            this.n5 = var1;
         }

         this.n5().n5().k5().l6(this.n5().l6(), this.t2());
         this.n5().n5().n5(true);
      }
   }

   public final void n5(boolean var1, boolean var2) {
      if (var2) {
         this.n3 = false;
      }

      this.m3();
      if (var1) {
         this.r4();
      }
   }

   @Override
   public final Boolean a6() {
      if (this.x8) {
         throw new CellCircularReferenceException("", this.n5(0, true));
      }

      if (this.u3() == null) {
         return Boolean.FALSE;
      }

      switch (this.c8()) {
         case 0:
            return (Boolean)this.u3();
         case 1:
            return com.aspose.slides.ms.System.z3.n3(this.u3()) != 0.0;
         case 2:
         default:
            return null;
         case 3:
         case 4:
         case 5:
            boolean var1 = false;
            boolean[] var2 = new boolean[]{false};
            boolean var3 = com.aspose.slides.ms.System.n3.n5((String)this.u3(), var2);
            var1 = var2[0];
            return var3 ? var1 : null;
      }
   }

   @Override
   public final Double u9() {
      if (this.x8) {
         throw new CellCircularReferenceException("", this.n5(0, true));
      }

      if (!this.n3) {
         this.r4();
      }

      if (this.y4 != null) {
         return this.y4;
      }

      if (this.n5 != null) {
         this.j5();
         return this.y4;
      }

      if (this.y4 == null) {
         this.j5();
      }

      return this.y4;
   }

   @Override
   public final String h0() {
      if (this.x8) {
         throw new CellCircularReferenceException("", this.n5(0, true));
      }

      if (!this.n3) {
         this.r4();
      }

      if (this.u3() == null) {
         return "";
      }

      switch (this.c8()) {
         case 0:
            return com.aspose.slides.ms.System.d1.t2(this.u3().toString());
         case 1:
            Object var1 = this.u3();
            if (var1 instanceof com.aspose.slides.ms.System.c4) {
               return var1.toString();
            }

            Number var2 = (Number)var1;
            return com.aspose.slides.ms.System.d2.u9(var2.doubleValue());
         case 2:
         default:
            return null;
         case 3:
         case 4:
         case 5:
            return (String)this.u3();
      }
   }

   @Override
   public final byte c8() {
      if (this.x8) {
         throw new CellCircularReferenceException("", this.n5(0, true));
      }

      if (!this.n3) {
         this.r4();
      }

      if (this.n5 == null && this.y4 == null) {
         this.m3();
      }

      return this.l6;
   }

   public final int n3() {
      return this.e2;
   }

   public final void u3(int var1) {
      this.e2 = var1;
   }

   public final boolean y4() {
      return this.n5 == null && this.y4 == null && com.aspose.slides.ms.System.d1.n5(this.k5) && this.u3 == null && this.u9 == null;
   }

   public final boolean e2() {
      return this.a6 != null && this.a6.size() > 0;
   }

   public final boolean t9() {
      return this.u3 != null || this.e2();
   }

   public final void n5(String var1, int var2) {
      String var3 = var1 == null ? var1 : com.aspose.slides.ms.System.d1.l6(var1);
      if (this.n3() != var2 || !com.aspose.slides.ms.System.d1.a6(this.k5, var3)) {
         this.k7();
         this.e2 = var2;
         this.n5(var3);
      }
   }

   @Override
   public final String n5(int var1) {
      if (this.n3() == var1) {
         return this.t4();
      }

      if (com.aspose.slides.ms.System.d1.n5(this.t4())) {
         return null;
      }

      IGenericList var2 = null;
      IGenericList[] var3 = new IGenericList[]{var2};
      y9i var4 = this.n5(this.t4(), this.n3(), var3);
      var2 = var3[0];
      return var1 == 0 ? var4.n5(this.t2()) : var4.toString();
   }

   @Override
   public final String n5(int var1, boolean var2) {
      String var3 = var1 == 0
         ? com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.n5.n5(this.k5()), com.aspose.slides.ms.System.a3.l6(this.l6())})
         : com.aspose.slides.ms.System.d1.n5("R{0}C{1}",new Object[]{ this.l6(), this.k5()});
      return var2 ? com.aspose.slides.ms.System.d1.n5("'{0}'!{1}",new Object[]{ this.n5().l6(), var3}) : var3;
   }

   @Override
   public final y9w t2() {
      return new y9w(this.l6(), this.k5(), this.n5().l6());
   }

   @Override
   public final void s7() {
      this.e2 = 1;
      this.n5(this.u3.n5(1));
      this.a6 = new List<>(this.u3.x8());
      this.u3 = null;
      this.a6.removeItem(this);
      List$Enumerator var1 = this.a6.iterator();

      try {
         while (var1.hasNext()) {
            r6t var2 = (r6t)var1.next();
            var2.l6(this);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      if (this.a6.size() == 0) {
         this.a6 = null;
      }
   }

   @Override
   public final void n5(r6t var1) {
      if (this.a6 != null) {
         this.a6.removeItem(var1);
      }
   }

   @Override
   public final IGenericEnumerable<r6t> x8() {
      return this.a6;
   }

   public final String z1() {
      if (!this.e2()) {
         return null;
      }

      int var1 = this.l6();
      int var2 = this.l6();
      int var3 = this.k5();
      int var4 = this.k5();
      List$Enumerator var5 = this.a6.iterator();

      try {
         while (var5.hasNext()) {
            r6t var6 = (r6t)var5.next();
            if (var6.l6() < var1) {
               var1 = var6.l6();
            } else if (var6.l6() > var2) {
               var2 = var6.l6();
            }

            if (var6.k5() < var3) {
               var3 = var6.k5();
            } else if (var6.k5() > var4) {
               var4 = var6.k5();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      String var10 = com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.n5.n5(var3), com.aspose.slides.ms.System.a3.l6(var1)});
      String var7 = com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.n5.n5(var4), com.aspose.slides.ms.System.a3.l6(var2)});
      return com.aspose.slides.ms.System.d1.n5(new String[]{var10, ":", var7});
   }

   @Override
   public final void l6(r6t var1) {
      this.u3 = var1;
      this.q0();
   }

   final String t4() {
      if (this.u9 != null) {
         return this.u9.a6();
      }

      if (com.aspose.slides.ms.System.d1.n5(this.k5) && this.u3 != null) {
         this.w1();
      }

      return this.k5;
   }

   private void n5(String var1) {
      if (!com.aspose.slides.ms.System.d1.a6(this.k5, var1)) {
         this.k5 = var1;
         this.q0();
         this.n5().n5().n5(true);
      }
   }

   p5c(b5v var1) {
      this.n5(var1);
      this.l6 = 1;
   }

   private void m1() {
      this.n5 = null;
      this.y4 = null;
      this.l6 = 1;
   }

   private void k7() {
      boolean var1 = !com.aspose.slides.ms.System.d1.n5(this.t4());
      if (this.u3 != null) {
         this.u3.n5(this);
         this.u3 = null;
      } else if (this.e2()) {
         this.a6.get_Item(0).s7();
         this.a6 = null;
      }

      this.k5 = null;
      this.u9 = null;
      if (var1) {
         this.n5().n5().k5().n5(this.n5().l6(), this.t2());
      }
   }

   private void m3() {
      if (this.u9 != null) {
         String var1 = "The cell {0} contains an unsupported formula.";
         String var2 = this.n5(this.n3(), true);
         throw new CellUnsupportedDataException(com.aspose.slides.ms.System.d1.n5("The cell {0} contains an unsupported formula.", new Object[]{var2}));
      }
   }

   private void l6(Object var1) {
      if (var1 == null) {
         this.l6 = 1;
      } else {
         if (com.aspose.slides.internal.v6g.k5.l6(var1, String.class)) {
            if (t7m.n5().containsItem((String)var1)) {
               this.l6 = 2;
            } else {
               this.l6 = 3;
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Boolean.class)) {
            this.l6 = 0;
         } else {
            this.l6 = 1;
         }
      }
   }

   private Object n5(double var1) {
      int var3 = g6z.u3(var1);
      return com.aspose.slides.ms.System.q1.n5((double)(var1), var3);
   }

   private void z8() {
      if (this.y4 == null) {
         this.n5((Object)null);
      } else {
         if (this.l6 == 0) {
            this.n5 = this.y4 != 0.0;
         } else {
            this.n5 = this.y4;
         }
      }
   }

   private void j5() {
      if (this.n5 == null) {
         this.y4 = new Double(0.0);
      } else {
         this.y4 = null;
         switch (this.c8()) {
            case 0:
               this.y4 = new Double((Boolean)this.n5 ? 1.0 : 0.0);
               break;
            case 1:
               this.y4 = new Double(com.aspose.slides.ms.System.z3.n3(this.n5));
            case 2:
            default:
               break;
            case 3:
            case 4:
            case 5:
               this.y4 = v4t.n5((String)this.n5, this.n5().n5());
         }
      }
   }

   private void w1() {
      String var1 = this.u3.n5(1);
      if (this.n3() == 1) {
         this.k5 = var1;
         this.r4();
      } else {
         IGenericList var2 = null;
         IGenericList[] var3 = new IGenericList[]{var2};
         y9i var4 = this.n5(var1, 1, var3);
         var2 = var3[0];
         this.k5 = var4.n5(this.t2());
         this.r4();
      }
   }

   private void r4() {
      if (!this.n3) {
         if (!com.aspose.slides.ms.System.d1.n5(this.t4())) {
            this.m1();
            this.x8 = true;
            IGenericList var1 = null;
            IGenericList[] var2 = new IGenericList[]{var1};
            y9i var3 = this.n5(this.t4(), this.n3(), var2);
            var1 = var2[0];
            if (var1 != null && var1.size() > 0) {
               this.n5().n5().k5().n5(this.n5().l6(), this.t2(), var1);
               this.n5().n5().k5().k5(this.n5().l6(), this.t2());
            }

            x5r var4 = new x5r(0.0);
            boolean var5 = false;

            try {
               var3.n5(new t8(this)).n5(var4);
            } catch (c1h var9) {
               this.n5 = var9.getMessage();
               this.l6 = 2;
               var5 = true;
            }

            if (!var5) {
               if (var4.l6() != 3) {
                  this.n5 = var4.n5();
                  this.n3 = true;
               }

               switch (var4.l6()) {
                  case 0:
                     this.l6 = 0;
                     break;
                  case 1:
                     this.l6 = 1;
                     break;
                  case 2:
                     this.l6 = 4;
                     break;
                  case 3:
                     a1h var6 = (a1h)var4.n5();
                     y9w var7 = var6.l6(this.t2());
                     if (var7 == null) {
                        this.n5 = "#VALUE!";
                        this.l6 = 2;
                     } else {
                        r6t var8 = this.n5().n5().n5(var7.n5()).n5(var7.l6().l6(), var7.k5().l6());
                        this.n5 = var8.u3() == null ? 0 : var8.u3();
                        this.l6 = var8.c8();
                     }
               }
            }

            this.x8 = false;
         }
      }
   }

   public final void q0() {
      this.n5(true, true);
      this.n5().n5().k5().l6(this.n5().l6(), this.t2());
   }

   public final void z3() {
      this.n3 = false;
   }

   private y9i n5(String var1, int var2, IGenericList<a1h>[] var3) {
      List var4 = new List();
      if (var2 == 0) {
         var4.addRange(a8v.k5());
         var4.addRange(a8v.a6());
      } else {
         var4.addRange(a8v.l6());
      }

      var4.addRange(a8v.u3());
      var4.addRange(a8v.n5());
      r6v var5 = new r6v(var4, var1);
      p3b var6 = new p3b(var5, this.l6(), this.k5(), var2, this.n5());
      y9i var7 = var6.k5();
      if (var7 == null) {
         throw new CellInvalidFormulaException(var6.n5(), this.n5(0, true));
      }

      var3[0] = var6.l6();
      return var7;
   }
}
