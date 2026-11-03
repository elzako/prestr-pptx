package com.aspose.slides.internal.w8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class p3 extends com.aspose.slides.internal.w5.k5 implements p6 {
   private q0 k5;
   private int u3 = -1;

   public p3(com.aspose.slides.internal.f5.e2 var1, com.aspose.slides.internal.f5.z1 var2) {
      super(var1, var2);
   }

   public final String j9() {
      return this.v8() ? "select-multiple" : "select-one";
   }

   public final int z6() {
      return this.u3;
   }

   public final void n5(int var1) {
      if (var1 < 0 || var1 > this.o5() - 1) {
         this.u3 = -1;
      }

      this.u3 = var1;
   }

   public final String e9() {
      return this.u3 == -1 ? d1.n5 : this.w2().n5(this.u3).e5();
   }

   public final void m3(String var1) {
      IGenericEnumerator var2 = this.w2().iterator();
      byte var3 = 0;
      byte var4 = -1;

      while (var2.hasNext()) {
         if (d1.a6(((com.aspose.slides.internal.j3.z8)var2.next()).e5(), var1)) {
            var4 = var3;
            break;
         }
      }

      this.u3 = var4;
   }

   public final int o5() {
      return this.w2().n5();
   }

   public final void l6(int var1) {
      if (var1 != this.w2().n5()) {
         if (var1 < 0) {
            var1 = 0;
         }

         if (var1 < this.w2().n5()) {
            IGenericEnumerator var9 = this.w2().iterator();
            List var3 = new List();

            while (var9.hasNext()) {
               if (var1 == 0) {
                  var3.addItem(var9.next());
               } else {
                  var1--;
               }
            }

            List$Enumerator var4 = var3.iterator();

            try {
               while (var4.hasNext()) {
                  com.aspose.slides.internal.f5.r4 var5 = (com.aspose.slides.internal.f5.r4)var4.next();
                  this.l6(var5);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         } else {
            for (int var2 = var1 - this.w2().n5(); var2 != 0; var2--) {
               this.u3(this.y4().a6("OPTION"));
            }
         }
      }
   }

   public final q0 j8() {
      if (this.k5 == null) {
         this.k5 = this.n5(q0.class);
      }

      return this.k5;
   }

   @Override
   public final void n5(q0 var1) {
      this.k5 = var1;
   }

   public final u6 w2() {
      return new t1(this.k7("OPTION"));
   }

   public final boolean s0() {
      return this.t2("disabled");
   }

   public final void n5(boolean var1) {
      this.k5("disabled", var1);
   }

   public final boolean v8() {
      return this.t2("multiple");
   }

   public final void k5(boolean var1) {
      this.k5("multiple", var1);
   }

   public final String v3() {
      return this.t2("name", d1.n5);
   }

   public final void z8(String var1) {
      this.n5("name", var1);
   }

   public final int g7() {
      return this.n5("size", 1, Integer.class);
   }

   public final void k5(int var1) {
      this.n5("size", var1);
   }

   public final int j4() {
      return this.n5("tabindex", 0, Integer.class);
   }

   public final void u3(int var1) {
      this.n5("tabindex", var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.w5.a6 var1) {
      com.aspose.slides.internal.w5.a6 var2 = var1.n5(this);
      if (var2 != null) {
         this.l6(var2);
         var1.n5(this, var2);
      }
   }
}
