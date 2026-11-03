package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Hashtable;

public class m4 {
   private Hashtable n5;
   private Object l6 = new Object();

   m4() {
      this.n5 = new Hashtable();
   }

   public final void n5(String var1, String[] var2) {
      if (!this.n5.containsKey(var1)) {
         synchronized (this.l6) {
            if (!this.n5.containsKey(var1)) {
               b9 var4 = new b9();

               for (int var5 = 0; var5 < var2.length; var5++) {
                  var4.n5(var5, var2[var5]);
               }

               this.n5.addItem(var1, var4);
            }
         }
      }
   }

   final b9 n5(String var1) {
      return this.n5.containsKey(var1) ? (b9)this.n5.get_Item(var1) : null;
   }
}
