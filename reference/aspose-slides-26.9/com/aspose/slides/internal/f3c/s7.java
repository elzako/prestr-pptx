package com.aspose.slides.internal.f3c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.CollectionBase;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.ms.System.j3;

@j3
public class s7 extends CollectionBase {
   public u9 l6(int var1) {
      return (u9)this.getInnerList().get_Item(var1);
   }

   @Override
   public IEnumerator iterator() {
      return new s7$n5(this);
   }

   @Override
   public int hashCode() {
      return this.getInnerList().hashCode();
   }

   @Override
   public boolean equals(Object obj) {
      return this.getInnerList().equals(obj);
   }

   protected ArrayList n5() {
      return this.getInnerList();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public u9 get_Item(int bridgeArg0) {
      return this.l6(bridgeArg0);
   }

}
