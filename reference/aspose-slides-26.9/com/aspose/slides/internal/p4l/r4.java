package com.aspose.slides.internal.p4l;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.y8;
import java.lang.annotation.Annotation;

class r4 extends k7 {
   private w1 n5;
   private w1 l6;
   private String k5;
   private final int u3;

   public r4(w1 var1, w1 var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.u3 = var3;
      if (var1 != null) {
         this.k5 = d1.k5(var1.s7(), 4);
      } else {
         this.k5 = d1.k5(var2.s7(), 4);
      }
   }

   public int a6() {
      return this.u3;
   }

   @Override
   public q0 n5(boolean var1) {
      return this.n5;
   }

   public z3[] u9() {
      return this.n5 != null ? this.n5.a6() : this.l6.a6();
   }

   @Override
   public q0 l6(boolean var1) {
      return this.l6;
   }

   @Override
   public y8 t2() {
      return this.n5 != null ? this.n5.t2() : this.l6.t2();
   }

   @Override
   public String s7() {
      return this.k5;
   }

   @Override
   public y8 k5() {
      return null;
   }

   @Override
   public boolean n5(y8 var1, boolean var2) {
      if (var1 == null) {
         throw new ArgumentNullException("attributeType");
      } else {
         c4 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.m1(), c4.class);
         if (var3 == null) {
            throw new ArgumentException("Argument must be a Type", "attributeType");
         } else {
            return com.aspose.slides.internal.p4l.u3.l6(this, var3);
         }
      }
   }

   @Override
   public Object[] l6(y8 var1, boolean var2) {
      if (var1 == null) {
         throw new ArgumentNullException("attributeType");
      } else {
         c4 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.m1(), c4.class);
         if (var3 == null) {
            throw new ArgumentException("Type must be a type provided by the runtime.", "attributeType");
         } else {
            return com.aspose.slides.internal.p4l.u3.n5(this, var3);
         }
      }
   }

   @Override
   public void n5(Object var1, Object var2, Object[] var3) {
      this.n5(var1, var2, 60, null, var3, null);
   }

   public void n5(Object var1, Object var2, int var3, l6 var4, Object[] var5, com.aspose.slides.internal.x7n.l6 var6) {
      q0 var7 = this.l6(true);
      if (var7 == null) {
         throw new ArgumentException("Property set method not found.");
      }

      Object[] var8 = null;
      if (var5 != null) {
         var8 = new Object[var5.length + 1];
         System.arraycopy(var5, 0, var8, 0, var5.length);
         var8[var5.length] = var2;
      } else {
         var8 = new Object[]{var2};
      }

      var7.n5(var1, var3, var4, var8, var6);
   }

   @Override
   public Annotation[] x8() {
      return this.n5 != null ? this.n5.x8() : this.l6.x8();
   }
}
