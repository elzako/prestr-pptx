package com.aspose.slides.internal.t3o;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerator;
import java.util.Iterator;

class u9 implements ICollection {
   private Iterator l6;
   // $VF: synthetic field
   final l6 n5;

   u9(l6 var1) {
      this.n5 = var1;
      this.l6 = com.aspose.slides.internal.t3o.l6.n5(this.n5).values().iterator();
   }

   @Override
   public int size() {
      return this.n5.size();
   }

   @Override
   public boolean isSynchronized() {
      return false;
   }

   @Override
   public Object getSyncRoot() {
      return this;
   }

   @Override
   public void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      for (Object var5 : com.aspose.slides.internal.t3o.l6.n5(this.n5).values()) {
         array.k5(var5, index++);
      }
   }

   @Override
   public IEnumerator iterator() {
      return new h0(this);
   }

   // $VF: synthetic method
   static Iterator n5(u9 var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static Iterator n5(u9 var0, Iterator var1) {
      return var0.l6 = var1;
   }
}
