package com.aspose.slides.internal.n7;

import com.aspose.slides.Collections.Generic.Dictionary;

public class u3 {
   private int n5 = 0;
   private Object l6 = new Object();
   private Dictionary<Object, Byte> k5 = new Dictionary<>(64);
   private Dictionary<Byte, Object> u3 = new Dictionary<>(64);

   public final boolean n5(Object var1) {
      return this.k5.containsKey(var1);
   }

   public final byte l6(Object var1) {
      return this.n5(var1) ? this.k5.get_Item(var1) : 0;
   }

   public final byte k5(Object var1) {
      if (!this.n5(var1)) {
         if (this.k5.size() < 64) {
            synchronized (this.l6) {
               this.k5.addItem(var1, (byte)this.n5);
               this.u3.addItem((byte)this.n5, var1);
               this.n5++;
            }
         } else {
            synchronized (this.l6) {
               byte var3 = (byte)(this.n5 % 64);
               Object var4 = this.u3.get_Item(var3);
               this.k5.removeItemByKey(var4);
               this.u3.removeItemByKey(var3);
               this.k5.addItem(var1, var3);
               this.u3.addItem(var3, var1);
               this.n5++;
            }
         }
      }

      return this.l6(var1);
   }
}
