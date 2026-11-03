package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.List;

public class y4k extends r4 {
   private List<h6l> n5 = null;

   public y4k() {
      this.w1().n5(com.aspose.slides.internal.v6g.k5.k5(61759, 9));
      this.w1().n5((byte)15);
   }

   List<h6l> l6() {
      if (this.n5 != null) {
         return this.n5;
      }

      this.n5 = this.a6();
      return this.n5;
   }

   public java.util.List<h6l> u3() {
      return List.toJava(this.l6());
   }

   private List<h6l> a6() {
      this.n5 = new List<>();
      int var1 = 0;

      while (var1 < this.e2().size()) {
         e4w var2 = this.e2().get_Item(var1) instanceof e4w ? (e4w)this.e2().get_Item(var1) : null;
         if (var2 == null) {
            break;
         }

         var1++;
         v4m var3 = null;
         if (var1 < this.e2().size()) {
            var3 = this.e2().get_Item(var1) instanceof v4m ? (v4m)this.e2().get_Item(var1) : null;
            if (var3 != null && var3.w1().k5() == 0) {
               var1++;
            }
         }

         g5d var4 = null;
         if (var1 < this.e2().size()) {
            var4 = this.e2().get_Item(var1) instanceof g5d ? (g5d)this.e2().get_Item(var1) : null;
            if (var4 != null && var4.w1().k5() == 1) {
               var1++;
            }
         }

         this.n5.addItem(new h6l(var2, var3, var4));
      }

      return this.n5;
   }
}
