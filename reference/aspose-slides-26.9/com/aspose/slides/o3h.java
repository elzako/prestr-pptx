package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class o3h {
   private Dictionary<String, y1i> n5 = null;

   o3h() {
      this.n5 = new Dictionary<>();
   }

   final void n5(FontFallBackRule var1) {
      this.n5(var1.n5());
   }

   final void n5(t1n var1) {
      this.n5(var1.l6());
   }

   private void n5(List<y1i> var1) {
      int var2 = var1.size();

      for (int var3 = 0; var3 < var2; var3++) {
         y1i var4 = (y1i)var1.get_Item(var3);
         if (!var4.k5()) {
            var4.n5(true);
            Object var5 = null;
            y1i[] var6 = new y1i[]{(y1i)var5};
            boolean var7 = this.n5.tryGetValue(var4.n5(), var6);
            y1i var8 = var6[0];
            if (var7) {
               var1.set_Item(var3, var8);
            } else {
               this.n5(var4);
            }
         }
      }
   }

   private void n5(y1i var1) {
      this.n5.addItem(var1.n5(), var1);
   }

   final y1i n5(String var1) {
      String var2 = com.aspose.slides.ms.System.d1.l6(var1);
      if (com.aspose.slides.ms.System.d1.n5(var2)) {
         return null;
      }

      y1i var3 = null;
      y1i[] var4 = new y1i[]{var3};
      boolean var5 = this.n5.tryGetValue(var2, var4);
      var3 = var4[0];
      if (var5) {
         return var3;
      }

      var3 = new y1i(com.aspose.slides.ms.System.d1.l6(var1));
      this.n5.addItem(var2, var3);
      return var3;
   }

   final List<y1i> n5(w2w var1, String var2) {
      List var3 = new List();
      int var4 = 0;
      Dictionary$Enumerator var5 = this.n5.iterator();

      try {
         while (var5.hasNext()) {
            KeyValuePair var6 = (KeyValuePair)var5.next();
            y1i var7 = (y1i)var6.getValue();
            if (var7.l6().x8()) {
               var3.addItem(var7);
            } else if (var1.n5(var7.l6())) {
               var3.insertItem(var4, var7);
               var4++;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return var3;
   }
}
