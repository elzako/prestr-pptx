package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

public class d0 {
   private Dictionary<com.aspose.slides.ms.System.Xml.k6, x4> n5 = new Dictionary<>();
   private List<d0$k5> l6 = new List<>();

   public final void n5(com.aspose.slides.ms.System.Xml.k6 var1, x4 var2) {
      this.n5.addItem(var1, var2);
      this.l6.addItem(new d0$k5(var1, var2));
   }

   public final void l6(com.aspose.slides.ms.System.Xml.k6 var1, x4 var2) {
      x4 var3 = null;
      x4[] var4 = new x4[]{var3};
      boolean var5 = this.n5.tryGetValue(var1, var4);
      var3 = var4[0];
      if (var5) {
         this.n5.set_Item(var1, var2);
         int var6 = this.n5(var3);
         this.l6.set_Item(var6, new d0$k5(var1, var2));
      } else {
         this.n5(var1, var2);
      }
   }

   public final void k5(com.aspose.slides.ms.System.Xml.k6 var1, x4 var2) {
      x4 var3 = null;
      x4[] var4 = new x4[]{var3};
      boolean var5 = this.n5.tryGetValue(var1, var4);
      var3 = var4[0];
      if (var5) {
         this.n5.set_Item(var1, var2);
         int var6 = this.n5(var3);
         this.l6.set_Item(var6, new d0$k5(var1, var2));
      }
   }

   public final void n5() {
      this.n5.clear();
      this.l6.clear();
   }

   public final void n5(com.aspose.slides.ms.System.Xml.k6 var1) {
      x4 var2 = null;
      x4[] var3 = new x4[]{var2};
      boolean var4 = this.n5.tryGetValue(var1, var3);
      var2 = var3[0];
      if (var4) {
         this.n5.removeItemByKey(var1);
         int var5 = this.n5(var2);
         this.l6.removeAt(var5);
      }
   }

   private int n5(x4 var1) {
      for (int var2 = 0; var2 < this.l6.size(); var2++) {
         if (this.l6.get_Item(var2).l6 == var1) {
            return var2;
         }
      }

      return -1;
   }

   public final int l6() {
      return this.n5.size();
   }

   public final boolean l6(com.aspose.slides.ms.System.Xml.k6 var1) {
      return this.n5.containsKey(var1);
   }

   public final x4 k5(com.aspose.slides.ms.System.Xml.k6 var1) {
      x4 var2 = null;
      x4[] var3 = new x4[]{var2};
      boolean var4 = this.n5.tryGetValue(var1, var3);
      var2 = var3[0];
      return var4 ? var2 : null;
   }

   public final ICollection k5() {
      return new d0$n5(this.l6, this.n5.size());
   }
}
