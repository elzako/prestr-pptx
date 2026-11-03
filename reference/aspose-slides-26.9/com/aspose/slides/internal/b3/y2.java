package com.aspose.slides.internal.b3;

import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.internal.h2.j9;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class y2 extends a5 implements com.aspose.slides.internal.f2.k5 {
   private int n5;
   private com.aspose.slides.internal.f2.u3 l6;
   private com.aspose.slides.internal.f2.u3 k5 = null;
   private int u3;

   public y2(int var1, com.aspose.slides.internal.f2.u3 var2, com.aspose.slides.internal.f2.u3 var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      switch (var1) {
         case 3:
            this.u3 = var2.l6() + var3.l6();
            break;
         case 4:
            this.u3 = var2.l6() - var3.l6();
            break;
         default:
            this.u3 = var2.l6();
      }
   }

   public y2(int var1, com.aspose.slides.internal.f2.u3 var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.u3 = var2.l6();
   }

   private com.aspose.slides.internal.f2.u3 k5(com.aspose.slides.internal.f2.u9 var1) {
      switch (this.n5) {
         case 1:
            return m1.n5(this.l6, this.k5, var1);
         case 2:
            return m1.l6(this.l6, this.k5, var1);
         case 3:
            return m1.k5(this.l6, this.k5, var1);
         case 4:
            return m1.u3(this.l6, this.k5, var1);
         case 5:
            return m1.a6(this.l6, this.k5, var1);
         case 6:
            return m1.l6(this.l6, var1);
         case 7:
            return m1.n5(this.l6, var1);
         case 8:
            return m1.u9(this.l6, this.k5, var1);
         case 9:
            return m1.h0(this.l6, this.k5, var1);
         default:
            throw new z8(d1.n5(new String[]{"Unknown expr operation ", a3.l6(this.n5)}));
      }
   }

   @Override
   public final double n5() {
      return this.k5(null).n5(null);
   }

   @Override
   public final double n5(com.aspose.slides.internal.f2.u9 var1) {
      return this.k5(var1).n5(var1);
   }

   @Override
   public final int l6() {
      return this.u3;
   }

   @Override
   public final boolean k5() {
      return false;
   }

   @Override
   public final void n5(int var1) {
   }

   @Override
   public com.aspose.slides.internal.f2.k5 c8() {
      return this.u3 == 1 ? this : null;
   }

   @Override
   public com.aspose.slides.internal.f2.u3 u9() {
      return this;
   }

   @Override
   public final int u3() {
      try {
         return com.aspose.slides.internal.v6g.k5.u3(this.n5(), 14);
      } catch (z8 var2) {
         return 0;
      }
   }

   @Override
   public final int l6(com.aspose.slides.internal.f2.u9 var1) {
      try {
         return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1), 14);
      } catch (z8 var3) {
         return 0;
      }
   }

   public final double t2() {
      double var1 = 0.0;
      double var3 = 0.0;
      if (com.aspose.slides.internal.v6g.k5.l6(this.l6, y2.class)) {
         var1 = ((y2)this.l6).t2();
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.l6, j9.class)) {
         var1 = ((j9)this.l6).e2();
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.k5, y2.class)) {
         var3 = ((y2)this.k5).t2();
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.k5, j9.class)) {
         var3 = ((j9)this.k5).e2();
      }

      if (var1 != 0.0 && var3 != 0.0) {
         switch (this.n5) {
            case 1:
               return var1 + var3;
            case 2:
               return var1 - var3;
            case 3:
               return var1 * var3;
            case 4:
               return var1 / var3;
            case 5:
               return var1 % var3;
            case 6:
            case 7:
            default:
               break;
            case 8:
               return q1.l6(var1, var3);
            case 9:
               return q1.k5(var1, var3);
         }
      } else {
         if (var1 != 0.0) {
            switch (this.n5) {
               case 6:
                  return -var1;
               case 7:
                  return q1.n5(var1);
               default:
                  return var1;
            }
         }

         if (var3 != 0.0) {
            return var3;
         }
      }

      return 0.0;
   }

   @Override
   public String toString() {
      switch (this.n5) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            return d1.n5(new Object[]{"(", this.l6, " ", " +-*/%".charAt(this.n5), this.k5, ")"});
         case 6:
            return "-" + this.l6;
         case 7:
            return d1.n5(new Object[]{"abs(", this.l6, ")"});
         case 8:
            return d1.n5(new Object[]{"max(", this.l6, ", ", this.k5, ")"});
         case 9:
            return d1.n5(new Object[]{"min(", this.l6, ", ", this.k5, ")"});
         default:
            return d1.n5(new String[]{"unknown operation ", a3.l6(this.n5)});
      }
   }

   @Override
   public int hashCode() {
      byte var1 = 31;
      int var2 = 1;
      var2 = 31 * var2 + this.u3;
      var2 = 31 * var2 + com.aspose.slides.internal.v3.u3.n5(this.l6);
      var2 = 31 * var2 + com.aspose.slides.internal.v3.u3.n5(this.k5);
      return 31 * var2 + this.n5;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(obj, y2.class)) {
         return false;
      }

      y2 var2 = (y2)obj;
      return this.u3 == var2.u3
         && com.aspose.slides.internal.v3.u3.n5(this.l6, var2.l6)
         && com.aspose.slides.internal.v3.u3.n5(this.k5, var2.k5)
         && this.n5 == var2.n5;
   }

   public final void n5(com.aspose.slides.internal.f2.u3 var1, com.aspose.slides.internal.f2.u3 var2) {
      if (this.l6.equals(var1)) {
         this.l6 = var2;
      }

      if (this.k5.equals(var1)) {
         this.k5 = var2;
      }

      y2 var3 = com.aspose.slides.internal.v6g.k5.n5(this.l6, y2.class);
      if (var3 != null) {
         var3.n5(var1, var2);
      }

      var3 = com.aspose.slides.internal.v6g.k5.n5(this.k5, y2.class);
      if (var3 != null) {
         var3.n5(var1, var2);
      }
   }
}
