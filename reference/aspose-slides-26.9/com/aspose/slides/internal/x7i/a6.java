package com.aspose.slides.internal.x7i;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class a6 extends h0<a6> {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private List<String> u9;
   private int h0;

   public final void n5() {
      this.h0 = 0;
      this.a6 = null;
   }

   public final int l6() {
      return this.h0;
   }

   public final String k5() {
      switch (this.h0) {
         case 0:
            return d1.n5;
         case 1:
            return this.n5;
         case 2:
            return d1.n5(new String[]{this.n5, this.l6});
         case 3:
            return d1.n5(new String[]{this.n5, this.l6, this.k5});
         case 4:
            return d1.n5(new String[]{this.n5, this.l6, this.k5, this.u3});
         default:
            return d1.n5(this.u9.toArray(new String[0]));
      }
   }

   public final void n5(String var1) {
      switch (this.h0) {
         case 0:
            this.n5 = var1;
            break;
         case 1:
            this.l6 = var1;
            break;
         case 2:
            this.k5 = var1;
            break;
         case 3:
            this.u3 = var1;
            break;
         case 4:
            int var2 = this.u9 == null ? 8 : this.u9.size();
            List var3 = new List(var2);
            this.u9 = var3;
            var3.addItem(this.n5);
            var3.addItem(this.l6);
            var3.addItem(this.k5);
            var3.addItem(this.u3);
            this.u9.addItem(var1);
            break;
         default:
            this.u9.addItem(var1);
      }

      this.h0++;
   }

   public void n5(a6 var1) {
      var1 = var1 == null ? new a6() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
      var1.h0 = this.h0;
   }

   public a6 u3() {
      a6 var1 = new a6();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.u3();
   }

   private boolean l6(a6 var1) {
      return j8.n5(var1.n5, this.n5)
         && j8.n5(var1.l6, this.l6)
         && j8.n5(var1.k5, this.k5)
         && j8.n5(var1.u3, this.u3)
         && j8.n5(var1.a6, this.a6)
         && j8.n5(var1.u9, this.u9)
         && var1.h0 == this.h0;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof a6) ? false : this.l6((a6)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public a6 Clone() {
      return this.u3();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(a6 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
