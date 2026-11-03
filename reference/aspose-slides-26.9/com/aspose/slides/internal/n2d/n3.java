package com.aspose.slides.internal.n2d;

import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedDictionary;
import com.aspose.slides.exceptions.NotImplementedException;
import java.util.Comparator;

public class n3 implements IGenericCollection<com.aspose.slides.internal.e1x.t4> {
   private final SortedDictionary<com.aspose.slides.internal.e1x.t4, com.aspose.slides.internal.e1x.t4> n5;

   public n3(Comparator<String> var1) {
      this.n5 = new SortedDictionary<>(new n3$n5(var1));
   }

   @Override
   public final IGenericEnumerator<com.aspose.slides.internal.e1x.t4> iterator() {
      return this.n5.getKeys().iterator();
   }

   public final void n5(com.aspose.slides.internal.e1x.t4 var1) {
      com.aspose.slides.internal.e1x.t4 var2 = null;
      com.aspose.slides.internal.e1x.t4[] var3 = new com.aspose.slides.internal.e1x.t4[]{var2};
      boolean var4 = !this.n5.tryGetValue(var1, var3) || var3[0].u3();
      var2 = var3[0];
      if (var4) {
         this.n5.set_Item(var1, var1);
      }
   }

   @Override
   public final void clear() {
      throw new NotImplementedException();
   }

   public final boolean l6(com.aspose.slides.internal.e1x.t4 var1) {
      throw new NotImplementedException();
   }

   public final void n5(com.aspose.slides.internal.e1x.t4[] var1, int var2) {
      throw new NotImplementedException();
   }

   public final boolean k5(com.aspose.slides.internal.e1x.t4 var1) {
      throw new NotImplementedException();
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final boolean isReadOnly() {
      return true;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean removeItem(com.aspose.slides.internal.e1x.t4 bridgeArg0) {
      return this.k5(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void copyToTArray(com.aspose.slides.internal.e1x.t4[] bridgeArg0, int bridgeArg1) {
      this.n5(bridgeArg0, bridgeArg1);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean containsItem(com.aspose.slides.internal.e1x.t4 bridgeArg0) {
      return this.l6(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void addItem(com.aspose.slides.internal.e1x.t4 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
