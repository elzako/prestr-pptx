package com.aspose.slides.internal.y6;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.j8;

public class a6 implements IGenericList<u3> {
   private List<u3> n5 = new List<>();

   public final int n5(u3 var1) {
      return this.n5.indexOf(var1);
   }

   public final void n5(int var1, u3 var2) {
      this.n5.insertItem(var1, var2);
   }

   @Override
   public final void removeAt(int index) {
      this.n5.removeAt(index);
   }

   public final u3 n5(int var1) {
      return this.n5.get_Item(var1);
   }

   public final void l6(int var1, u3 var2) {
      this.n5.set_Item(var1, var2);
   }

   public final void l6(u3 var1) {
      this.n5.addItem(var1);
   }

   @Override
   public final void clear() {
      this.n5.clear();
   }

   public final boolean k5(u3 var1) {
      return this.n5.containsItem(var1);
   }

   public final void n5(u3[] var1, int var2) {
      this.n5.copyToTArray(var1, var2);
   }

   public final boolean u3(u3 var1) {
      return this.n5.removeItem(var1);
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final boolean isReadOnly() {
      return false;
   }

   @Override
   public final IGenericEnumerator<u3> iterator() {
      return this.n5.iterator();
   }

   protected final boolean n5(a6 var1) {
      if (var1 == null) {
         return false;
      }

      if (this.size() != var1.size()) {
         return false;
      }

      for (int var2 = 0; var2 < this.size(); var2++) {
         if (!this.n5(var2).equals(var1.n5(var2))) {
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((a6)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.n5 != null ? this.n5.hashCode() : 0;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void set_Item(int bridgeArg0, u3 bridgeArg1) {
      this.l6(bridgeArg0, bridgeArg1);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public u3 get_Item(int bridgeArg0) {
      return this.n5(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void insertItem(int bridgeArg0, u3 bridgeArg1) {
      this.n5(bridgeArg0, bridgeArg1);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int indexOfItem(u3 bridgeArg0) {
      return this.n5(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean removeItem(u3 bridgeArg0) {
      return this.u3(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void copyToTArray(u3[] bridgeArg0, int bridgeArg1) {
      this.n5(bridgeArg0, bridgeArg1);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean containsItem(u3 bridgeArg0) {
      return this.k5(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void addItem(u3 bridgeArg0) {
      this.l6(bridgeArg0);
   }

}
