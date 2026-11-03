package com.aspose.slides.internal.u6;

import com.aspose.slides.internal.h2.t2$n5;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;

public class c8 {
   private y4 h0;
   protected m1 n5;
   private y1 c8;
   private int t2;
   private int s7;
   private byte x8 = 0;
   public u3 l6;
   public u3 k5;
   public n5 u3;
   public n5 a6;
   protected com.aspose.slides.internal.j9.k5 u9;

   protected c8(z1 var1, int var2, int var3) {
      this(var2, var3);
      this.n5(var1);
   }

   protected c8(m1 var1, int var2, int var3) {
      this(var2, var3);
      this.n5 = var1;
      this.n5(var1.e5());
   }

   public c8(y4 var1, int var2, int var3) {
      this(var1.u9(), var2, var3);
      this.h0 = var1;
   }

   private c8(int var1, int var2) {
      this.t2 = var1;
      this.s7 = var2;
   }

   private void n5(z1 var1) {
      if (!var1.s0()) {
         this.u9 = com.aspose.slides.internal.j9.k5.n5(var1.w2());
         this.n5();
      }
   }

   protected void n5() {
      this.l6 = this.n5.x8.n5();
      if (this.s7 > 0) {
         this.l6.n5 = com.aspose.slides.internal.u6.n5.n5();
      }

      this.k5 = this.n5.n3.n5();
      if (!this.a6()) {
         this.k5.n5 = com.aspose.slides.internal.u6.n5.n5();
      }

      if (this.t2 == 0) {
         this.u3 = this.n5.y4;
      } else {
         this.u3 = com.aspose.slides.internal.u6.n5.n5();
      }

      if (this.u3()) {
         this.a6 = this.n5.e2;
      } else {
         this.a6 = com.aspose.slides.internal.u6.n5.n5();
      }
   }

   public final m1 u9() {
      return this.n5;
   }

   public final y1 h0() {
      return this.c8;
   }

   public final void n5(y1 var1) {
      this.c8 = var1;
   }

   public y4 l6() {
      return this.h0;
   }

   public boolean k5() {
      return false;
   }

   public final boolean c8() {
      return this.n5 == null;
   }

   public boolean u3() {
      return this.t2 == this.n5.z7() - 1;
   }

   public boolean a6() {
      return this.s7 == this.n5.v4() - 1;
   }

   public final int t2() {
      return this.s7;
   }

   public final int s7() {
      return this.t2;
   }

   public final t2$n5 n5(int var1) {
      switch (var1) {
         case 0:
            return this.l6.n5.l6();
         case 1:
            return this.l6.l6.l6();
         case 2:
            return this.l6.k5.l6();
         default:
            return null;
      }
   }

   public final t2$n5 l6(int var1) {
      switch (var1) {
         case 0:
            return this.k5.n5.l6();
         case 1:
            return this.k5.l6.l6();
         case 2:
            return this.k5.k5.l6();
         default:
            return null;
      }
   }

   public final t2$n5 x8() {
      return this.u3.l6();
   }

   public final t2$n5 n3() {
      return this.a6.l6();
   }

   public final void n5(c8 var1, int var2) {
      Object var3 = null;
      switch (var2) {
         case 0:
            this.l6.n5(var1.k5, true, false, false);
            break;
         case 1:
            this.k5.n5(var1.l6, true, false, false);
            break;
         case 2:
            var3 = this.u9.n5(this.u3, var1.a6);
            if (var3 != null) {
               this.u3 = (n5)var3;
               var1.a6 = (n5)var3;
            }
            break;
         case 3:
            var3 = this.u9.n5(this.a6, var1.u3);
            if (var3 != null) {
               this.a6 = (n5)var3;
               var1.u3 = (n5)var3;
            }
      }
   }

   public final void n5(int var1, w1 var2, boolean var3, boolean var4, boolean var5) {
      switch (var1) {
         case 0:
            this.l6.k5(var2.x8, var3, var4, var5);
            break;
         case 1:
            this.k5.k5(var2.n3, var3, var4, var5);
      }
   }

   public final void n5(int var1, w1 var2) {
      switch (var1) {
         case 0:
         case 1:
            this.n5(var1, var2, true, true, true);
            break;
         case 2:
            this.u3 = this.u9.n5(this.u3, var2.y4);
            break;
         case 3:
            this.a6 = this.u9.n5(this.a6, var2.e2);
      }
   }

   public final void n5(int var1, n5 var2) {
      switch (var1) {
         case 2:
            this.u3 = this.u9.n5(this.u3, var2);
            break;
         case 3:
            this.a6 = this.u9.n5(this.a6, var2);
      }
   }

   public final void n5(int var1, u3 var2, boolean var3, boolean var4, boolean var5) {
      switch (var1) {
         case 0:
            this.l6.l6(var2, var3, var4, var5);
            break;
         case 1:
            this.k5.l6(var2, var3, var4, var5);
      }
   }

   public final boolean k5(int var1) {
      return (this.x8 & 255 & 1 << var1) != 0;
   }

   public final void n5(int var1, boolean var2) {
      if (var2) {
         this.x8 = (byte)(this.x8 & 0xFF | (byte)(1 << var1) & 0xFF);
      } else {
         this.x8 = (byte)(this.x8 & 0xFF & (byte)(~(1 << var1)) & 0xFF);
      }
   }

   public final void u3(int var1) {
      this.n5(var1, true);
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      if (this.c8()) {
         var1.n5("EMPTY");
      } else if (this.k5()) {
         var1.n5("Primary");
      }

      var1.n5("GridUnit:");
      if (this.t2 > 0) {
         var1.n5(" colSpan=").k5(this.t2);
         if (this.u3()) {
            var1.n5("(last)");
         }
      }

      if (this.s7 > 0) {
         var1.n5(" rowSpan=").k5(this.s7);
         if (this.a6()) {
            var1.n5("(last)");
         }
      }

      if (!this.k5() && this.l6() != null) {
         var1.n5(" primary=").k5(this.l6().z3());
         var1.n5("/").k5(this.l6().m1());
         if (this.l6().u9() != null) {
            var1.n5(d1.n5(new String[]{" id=", this.l6().u9().y1()}));
         }
      }

      var1.n5(" flags=").n5(this.x8);
      return var1.toString();
   }
}
