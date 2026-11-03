package com.aspose.slides.internal.z6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.y8;
import java.util.Comparator;
import java.util.Iterator;

public class t4 implements Comparator<t9> {
   private Dictionary<y8, t9> n5 = new Dictionary<>();
   private List<t9> l6 = new List<>();
   private int k5;

   public final int n5(t9 var1, t9 var2) {
      if (var1.n5() < var2.n5()) {
         return 1;
      } else {
         return var1.n5() > var2.n5() ? -1 : 0;
      }
   }

   public t4() {
      this.n5();
   }

   public final void n5(t9 var1) {
      y8 var2 = var1.l6();
      this.n5.addItem(var2, var1);
      this.l6.addItem(var1);
      this.l6.sort(this);
      this.k5++;
   }

   private void n5() {
      Iterator var1 = com.aspose.slides.internal.v3.s7.n5(t9.class);
      if (var1 != null) {
         while (var1.hasNext()) {
            t9 var2 = (t9)var1.next();

            try {
               this.n5(var2);
            } catch (ArgumentException var4) {
               throw new RuntimeException(var4);
            }
         }
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compare(t9 bridgeArg0, t9 bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }

}
