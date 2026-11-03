package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.CollectionBase;
import com.aspose.slides.Collections.IEnumerator;
import java.util.Iterator;

public class z4 extends CollectionBase {
   private x4 n5;

   public x4 n5(int var1) {
      return (x4)this.getInnerList().get_Item(var1);
   }

   public void n5(int var1, x4 var2) {
      this.getInnerList().set_Item(var1, var2);
   }

   public final h3 n5() {
      return new h3(this.getInnerList().iterator());
   }

   public final int n5(x4 var1) {
      return this.getInnerList().addItem(var1);
   }

   public final void l6(x4 var1) {
      this.getInnerList().removeItem(var1);
   }

   @Override
   protected void onInsert(int index, Object item) {
      if (this.n5 != null) {
         this.n5.n5(this, item);
      }
   }

   @Override
   protected void onSet(int index, Object oldValue, Object newValue) {
      if (this.n5 != null) {
         this.n5.l6(this, oldValue);
         this.n5.n5(this, newValue);
      }
   }

   @Override
   protected void onClear() {
      if (this.n5 != null) {
         this.n5.u3(this);
      }
   }

   @Override
   protected void onRemove(int index, Object item) {
      if (this.n5 != null) {
         this.n5.l6(this, item);
      }
   }

   public final z4 l6() {
      z4 var1 = new z4();
      var1.n5(this);
      return var1;
   }

   private void n5(z4 var1) {
      this.getInnerList().insertRange(0, var1);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public x4 get_Item(int bridgeArg0) {
      return this.n5(bridgeArg0);
   }


   // Original IEnumerator forwarding descriptor; javac supplies the Iterator bridge.
   @Override
   public com.aspose.slides.Collections.IEnumerator iterator() {
      return this.n5();
   }




}
