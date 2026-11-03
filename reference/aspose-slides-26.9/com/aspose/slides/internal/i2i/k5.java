package com.aspose.slides.internal.i2i;

import com.aspose.slides.Collections.CollectionBase;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.j3;

@j3
public class k5 extends CollectionBase implements IEnumerable {
   public k5() {
   }

   public k5(k5 var1) {
      this.n5(var1);
   }

   public l6 n5(int var1) {
      return (l6)this.getInnerList().get_Item(var1);
   }

   public int n5(l6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         return this.getInnerList().addItem(var1);
      }
   }

   public void n5(k5 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      for (int var2 = 0; var2 < var1.getInnerList().size(); var2++) {
         this.getInnerList().addItem(var1.n5(var2));
      }
   }

   public boolean l6(l6 var1) {
      return this.k5(var1) != -1;
   }

   public void n5(l6[] var1, int var2) {
      this.getInnerList().copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var1)), var2);
   }

   @Override
   public IEnumerator iterator() {
      return this.getInnerList().iterator();
   }

   @Override
   public int hashCode() {
      return this.getInnerList().hashCode();
   }

   @Override
   public boolean equals(Object obj) {
      return this.getInnerList().equals(obj);
   }

   public int k5(l6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      byte[] var2 = var1.k5();

      for (int var3 = 0; var3 < this.getInnerList().size(); var3++) {
         l6 var4 = (l6)this.getInnerList().get_Item(var3);
         if (this.n5(var4.k5(), var2)) {
            return var3;
         }
      }

      return -1;
   }

   public void u3(l6 var1) {
      this.getInnerList().removeItem(var1);
   }

   private boolean n5(byte[] var1, byte[] var2) {
      if (var1 == null && var2 == null) {
         return true;
      }

      if (var1 != null && var2 != null) {
         if (var1.length != var2.length) {
            return false;
         }

         for (int var3 = 0; var3 < var1.length; var3++) {
            if (var1[var3] != var2[var3]) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public l6 get_Item(int bridgeArg0) {
      return this.n5(bridgeArg0);
   }

}
