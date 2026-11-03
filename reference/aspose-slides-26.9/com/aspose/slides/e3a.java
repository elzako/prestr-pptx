package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

class e3a implements h4n {
   private final List<y0v> n5 = new List<>();

   public e3a() {
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final boolean isReadOnly() {
      return false;
   }

   public final void n5(y0v var1) {
      this.n5.addItem(var1);
   }

   @Override
   public final void clear() {
      this.n5.clear();
   }

   public final boolean l6(y0v var1) {
      return this.n5.containsItem(var1);
   }

   public final void n5(y0v[] var1, int var2) {
      this.n5.copyToTArray(var1, var2);
   }

   public final boolean k5(y0v var1) {
      return this.n5.removeItem(var1);
   }

   @Override
   public final IGenericEnumerator<y0v> iterator() {
      return this.n5.iterator();
   }

   public final y0v n5(int var1) {
      return this.n5.get_Item(var1);
   }

   public final void n5(int var1, y0v var2) {
      this.n5.set_Item(var1, var2);
   }

   public final int u3(y0v var1) {
      return this.n5.indexOf(var1);
   }

   public final void l6(int var1, y0v var2) {
      this.n5.insertItem(var1, var2);
   }

   @Override
   public final void removeAt(int index) {
      this.n5.removeAt(index);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void set_Item(int bridgeArg0, y0v bridgeArg1) {
      this.n5(bridgeArg0, bridgeArg1);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public y0v get_Item(int bridgeArg0) {
      return this.n5(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void insertItem(int bridgeArg0, y0v bridgeArg1) {
      this.l6(bridgeArg0, bridgeArg1);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int indexOfItem(y0v bridgeArg0) {
      return this.u3(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean removeItem(y0v bridgeArg0) {
      return this.k5(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void copyToTArray(y0v[] bridgeArg0, int bridgeArg1) {
      this.n5(bridgeArg0, bridgeArg1);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean containsItem(y0v bridgeArg0) {
      return this.l6(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void addItem(y0v bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
