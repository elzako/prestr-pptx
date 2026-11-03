package com.aspose.slides.internal.d5;

import com.aspose.slides.internal.e5.t2;
import com.aspose.slides.internal.e5.x8;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.v4.z3;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class u9 {
   private t2 n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;

   public u9(t2 var1, int var2, int var3) {
      this(var1, var2, var2, var3, -1);
   }

   public u9(t2 var1, int var2, int var3, int var4, int var5) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
   }

   public final t2 n5() {
      return this.n5;
   }

   public final int l6() {
      return this.k5;
   }

   public final int k5() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.a6 = var1;
   }

   public final void u3() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.n5, x8.class)) {
         ((x8)this.n5).n5(this.a6, this.k5 - this.l6, this.u3 - this.l6);
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.n5, com.aspose.slides.internal.v4.t2.class)) {
         ((com.aspose.slides.internal.v4.t2)this.n5).u3(this.a6);
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.n5, com.aspose.slides.internal.v4.k5.class)) {
         ((com.aspose.slides.internal.v4.k5)this.n5).u3(this.a6);
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.n5, com.aspose.slides.internal.v4.n5.class)) {
         ((com.aspose.slides.internal.v4.n5)this.n5).u3(this.a6);
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.n5, z3.class)) {
         ((z3)this.n5).u3(this.a6);
      }
   }

   @Override
   public boolean equals(Object o) {
      if (com.aspose.slides.internal.v6g.k5.l6(o, u9.class)) {
         u9 var2 = (u9)o;
         if (var2.n5() != this.n5) {
            return false;
         } else {
            return var2.l6() != this.k5 ? false : var2.k5() == this.u3;
         }
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5 != null ? this.n5.hashCode() : 0;
      var1 = (var1 ^ this.k5) + (var1 << 19);
      return (var1 ^ this.u3) + (var1 << 11);
   }

   @Override
   public final String toString() {
      a5 var1 = new a5();
      char var2;
      if (com.aspose.slides.internal.v6g.k5.l6(this.n5, x8.class)) {
         var2 = 'T';
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.n5, com.aspose.slides.internal.v4.t2.class)) {
         var2 = 'C';
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.n5, com.aspose.slides.internal.v4.u9.class)) {
         var2 = 'B';
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.n5, com.aspose.slides.internal.v4.k5.class)) {
         var2 = '#';
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.n5, com.aspose.slides.internal.v4.n5.class)) {
         var2 = 'G';
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.n5, z3.class)) {
         var2 = 'L';
      } else {
         var2 = '?';
      }

      var1.n5(var2);
      var1.n5(d1.n5("[", a3.l6(this.k5), ",", a3.l6(this.u3), "][", a3.l6(this.l6), "](", a3.l6(this.a6), ")"));
      return var1.toString();
   }
}
