package com.aspose.slides.internal.z6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import java.util.Iterator;

public class j5 {
   private Dictionary<String, List<e2>> n5 = new Dictionary<>();

   public j5() {
      this.n5();
   }

   private void l6(e2 var1) {
      this.n5("*", var1);
   }

   public final void n5(e2 var1) {
      String var2 = var1.n5();
      if (var2 == null) {
         this.l6(var1);
      } else {
         this.n5(var2, var1);
      }
   }

   private void n5(String var1, e2 var2) {
      List var3 = com.aspose.slides.internal.v6g.k5.n5(this.n5.get_Item(var1), List.class);
      if (var3 == null) {
         var3 = new List();
         this.n5.addItem(var1, var3);
      }

      var3.addItem(var2);
   }

   private void n5() {
      Iterator var1 = com.aspose.slides.internal.v3.s7.n5(e2.class);
      if (var1 != null) {
         while (var1.hasNext()) {
            e2 var2 = (e2)var1.next();

            try {
               this.n5(var2);
            } catch (IllegalArgumentException var4) {
               throw new RuntimeException(var4);
            }
         }
      }
   }
}
