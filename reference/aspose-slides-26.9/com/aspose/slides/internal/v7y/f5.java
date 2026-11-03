package com.aspose.slides.internal.v7y;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;

public class f5 extends e9 {
   protected ArrayList n5;
   protected int l6;

   public f5(ArrayList var1) {
      this.n5 = var1;
   }

   public f5(f5 var1) {
      this.n5 = var1.n5;
      this.l6 = var1.l6;
   }

   public f5(com.aspose.slides.internal.x6s.h0 var1) {
      this.n5 = new ArrayList();

      while (var1.l6()) {
         this.n5.addItem(var1.k5().n5());
      }
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new f5(this);
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 k5() {
      if (this.l6 < 1) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.Xml.v3.n5("Enumeration has not started. Call MoveNext.", com.aspose.slides.ms.System.d1.n5)
         );
      } else {
         return (com.aspose.slides.internal.x6s.a6)this.n5.get_Item(this.l6 - 1);
      }
   }

   @Override
   public int u3() {
      return this.l6;
   }

   @Override
   public int a6() {
      return this.n5.size();
   }

   @Override
   public boolean l6() {
      if (this.l6 == this.n5.size()) {
         return false;
      }

      this.l6++;
      return true;
   }

   @Override
   public void t2() {
      this.l6 = 0;
   }

   @Override
   public IEnumerator iterator() {
      return this.n5.iterator();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
