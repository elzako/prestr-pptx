package com.aspose.slides.internal.o8x;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.Xml.f0;

class l6$l6 extends com.aspose.slides.internal.v6g.h0<l6$l6> {
   private f0 n5;
   private int l6;
   private String k5;
   private int u3;
   private int a6;

   public l6$l6() {
   }

   public final void n5(f0 var1) {
      this.n5 = var1;
      this.l6 = 0;
   }

   public final int n5() {
      return this.l6;
   }

   public final boolean l6() {
      return this.l6 != 0;
   }

   public final int k5() {
      return this.u3;
   }

   public final int u3() {
      return this.a6;
   }

   public final void n5(String var1, int var2) {
      if (var1.length() != 0) {
         if (this.l6 == 0) {
            this.k5 = var1;
            this.l6 = var2;
            if (this.n5 != null) {
               this.u3 = this.n5.ah_();
               this.a6 = this.n5.ai_();
            }
         } else {
            this.k5 = d1.n5(new String[]{this.k5, var1});
            if (var2 < this.l6) {
               this.l6 = var2;
            }
         }
      }
   }

   public final String a6() {
      if (this.l6 == 0) {
         return d1.n5;
      }

      this.l6 = 0;
      return this.k5;
   }

   public void n5(l6$l6 var1) {
      var1 = var1 == null ? new l6$l6() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
   }

   public l6$l6 u9() {
      l6$l6 var1 = new l6$l6();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.u9();
   }

   private boolean l6(l6$l6 var1) {
      return j8.n5(var1.n5, this.n5) && var1.l6 == this.l6 && j8.n5(var1.k5, this.k5) && var1.u3 == this.u3 && var1.a6 == this.a6;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof l6$l6) ? false : this.l6((l6$l6)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public l6$l6 Clone() {
      return this.u9();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(l6$l6 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
