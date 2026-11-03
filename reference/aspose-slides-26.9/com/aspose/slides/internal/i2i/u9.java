package com.aspose.slides.internal.i2i;

import com.aspose.slides.Collections.CollectionBase;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.d1;

public final class u9 extends CollectionBase implements IEnumerable {
   private boolean n5;

   public u9() {
   }

   public u9(com.aspose.slides.internal.x8w.l6 var1) {
      this();
      this.n5 = true;
      if (var1 != null) {
         if (var1.l6() != 48) {
            throw new Exception("Invalid extensions format");
         }

         for (int var2 = 0; var2 < var1.n5(); var2++) {
            a6 var3 = new a6(var1.n5(var2));
            this.getInnerList().addItem(var3);
         }
      }
   }

   public int n5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("oid");
      }

      for (int var2 = 0; var2 < this.getInnerList().size(); var2++) {
         a6 var3 = (a6)this.getInnerList().get_Item(var2);
         if (d1.a6(var3.k5(), var1)) {
            return var2;
         }
      }

      return -1;
   }

   @Override
   public IEnumerator iterator() {
      return this.getInnerList().iterator();
   }

   public a6 n5(int var1) {
      return (a6)this.getInnerList().get_Item(var1);
   }

   public a6 l6(String var1) {
      int var2 = this.n5(var1);
      return var2 == -1 ? null : (a6)this.getInnerList().get_Item(var2);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public a6 get_Item(int bridgeArg0) {
      return this.n5(bridgeArg0);
   }

}
