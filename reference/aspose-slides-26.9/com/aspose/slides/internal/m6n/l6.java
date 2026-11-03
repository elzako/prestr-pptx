package com.aspose.slides.internal.m6n;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.NotImplementedException;

public class l6 implements IGenericCollection<n5>, IGenericEnumerable<n5> {
   private ArrayList n5 = new ArrayList();

   @Override
   public int size() {
      return this.n5.size();
   }

   @Override
   public boolean isReadOnly() {
      return false;
   }

   public void n5(n5 var1) {
      this.n5.addItem(var1);
   }

   @Override
   public void clear() {
      this.n5.clear();
   }

   public boolean l6(n5 var1) {
      for (Object recoveredElement$var3$778 : this.n5) {
         n5 var3 = (n5)recoveredElement$var3$778;
         if (var3.equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public void n5(n5[] var1, int var2) {
      throw new NotImplementedException();
   }

   @Override
   public IGenericEnumerator<n5> iterator() {
      throw new NotImplementedException();
   }

   public boolean k5(n5 var1) {
      for (Object recoveredElement$var3$1145 : this.n5) {
         n5 var3 = (n5)recoveredElement$var3$1145;
         if (var3.equals(var1)) {
            this.n5.removeItem(var3);
            return true;
         }
      }

      return false;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean removeItem(n5 bridgeArg0) {
      return this.k5(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void copyToTArray(n5[] bridgeArg0, int bridgeArg1) {
      this.n5(bridgeArg0, bridgeArg1);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean containsItem(n5 bridgeArg0) {
      return this.l6(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void addItem(n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
