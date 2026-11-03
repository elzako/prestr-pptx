package com.aspose.slides.internal.p4l;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

class y2$k5<T> {
   private final Object l6;
   private final Dictionary<String, List<T>> k5;
   private List<T> u3;
   private final List<String> a6;
   // $VF: synthetic field
   final y2 n5;

   private y2$k5(y2 var1) {
      this.n5 = var1;
      this.l6 = new Object();
      this.k5 = new Dictionary<>();
      this.u3 = null;
      this.a6 = new List<>();
   }

   void n5(String var1, List<T> var2) {
      if (var1 == null) {
         synchronized (this.l6) {
            this.u3 = var2;
         }
      } else {
         synchronized (this.l6) {
            if (!this.k5.containsKey(var1)) {
               this.k5.addItem(var1, var2);
               this.a6.addItem(var1);
               if (this.a6.size() > 10) {
                  String var4 = this.a6.get_Item(0);
                  this.k5.removeItemByKey(var4);
                  this.a6.removeAt(0);
               }
            }
         }
      }
   }

   List<T> n5(String var1) {
      if (var1 == null) {
         synchronized (this.l6) {
            return this.u3;
         }
      } else {
         synchronized (this.l6) {
            Object var3 = null;
            Object[] var4 = new Object[]{var3};
            this.k5.tryGetValue(var1, var4);
            return (List<T>)var4[0];
         }
      }
   }

   // $VF: synthetic method
   y2$k5(y2 var1, y1 var2) {
      this(var1);
   }
}
