package com.aspose.slides.internal.v6g;

import com.aspose.slides.ms.System.z6;
import java.util.ArrayList;

public abstract class n5<T extends z6> {
   protected final ArrayList<T> l6 = new n5$n5<>();

   public final synchronized void k5(T var1) {
      this.l6.clear();
      this.l6.add((T)var1);
   }

   public synchronized void l6(z6 var1) {
      String var2 = var1.getDelegateId();
      if (var2 != null) {
         for (int var3 = this.l6.size() - 1; var3 >= 0; var3--) {
            if (var2.equals(this.l6.get(var3).getDelegateId())) {
               return;
            }
         }
      }

      this.l6.add((T)var1);
   }

   public synchronized void n5(z6 var1) {
      String var2 = var1.getDelegateId();
      if (var2 != null) {
         for (int var3 = this.l6.size() - 1; var3 >= 0; var3--) {
            if (var2.equals(this.l6.get(var3).getDelegateId())) {
               this.l6.remove(var3);
               return;
            }
         }
      }

      this.l6.remove(var1);
   }

   public synchronized boolean n5() {
      return this.l6.isEmpty();
   }
}
