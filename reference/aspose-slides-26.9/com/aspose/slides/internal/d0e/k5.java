package com.aspose.slides.internal.d0e;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.p6;

public class k5 implements IGenericDictionary<String, String> {
   private Dictionary<String, String> n5;

   public k5() {
      this.n5 = new Dictionary<>(p6.u3());
   }

   public k5(Dictionary<String, String> var1) {
      this.n5 = new Dictionary<>(var1, p6.u3());
   }

   public final boolean n5(String var1) {
      return this.n5.containsKey(var1);
   }

   public final void n5(String var1, String var2) {
      this.n5.addItem(var1, var2);
   }

   public final boolean l6(String var1) {
      return this.n5.removeItemByKey(var1);
   }

   public final boolean n5(String var1, String[] var2) {
      return this.n5.tryGetValue(var1, var2);
   }

   public final String k5(String var1) {
      return this.n5.containsKey(var1) ? this.n5.get_Item(var1) : null;
   }

   public final void l6(String var1, String var2) {
      if (var2 == null && this.n5(var1)) {
         this.l6(var1);
      } else if (var2 != null) {
         if (!this.n5.containsKey(var1)) {
            this.n5(var1, var2);
         } else {
            this.n5.set_Item(var1, var2);
         }
      }
   }

   @Override
   public final IGenericCollection<String> getKeys() {
      return this.n5.getKeys();
   }

   @Override
   public final IGenericCollection<String> getValues() {
      return this.n5.getValues();
   }

   public final String k5(String var1, String var2) {
      return this.n5(new String[]{var1}, var2);
   }

   public final String n5(String[] var1, String var2) {
      String var3 = this.n5(var1);
      if (var3 == null) {
         var3 = var2;
      }

      return var3;
   }

   public final String u3(String var1) {
      return this.n5(new String[]{var1});
   }

   public final String n5(String[] var1) {
      for (String var5 : var1) {
         if (this.n5(var5)) {
            return this.n5.get_Item(var5);
         }
      }

      return null;
   }

   @Override
   public final IGenericEnumerator<KeyValuePair<String, String>> iterator() {
      return this.n5.iterator();
   }

   public final void u3(String var1, String var2) {
      this.n5.addItem(var1, var2);
   }

   public final boolean a6(String var1) {
      return this.n5.removeItemByKey(var1);
   }

   public final boolean n5(String var1, Object[] var2) {
      return this.n5(var1, (String[])var2);
   }

   public final void n5(KeyValuePair<String, String> var1) {
      throw new NotImplementedException();
   }

   @Override
   public final void clear() {
      this.n5.clear();
   }

   public final boolean l6(KeyValuePair<String, String> var1) {
      throw new NotImplementedException();
   }

   public final void n5(KeyValuePair<String, String>[] var1, int var2) {
      throw new NotImplementedException();
   }

   public final boolean k5(KeyValuePair<String, String> var1) {
      throw new NotImplementedException();
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final boolean isReadOnly() {
      throw new NotImplementedException();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void set_Item(String bridgeArg0, String bridgeArg1) {
      this.l6(bridgeArg0, bridgeArg1);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public String get_Item(String bridgeArg0) {
      return this.k5(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean tryGetValue(String bridgeArg0, Object[] bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean removeItemByKey(String bridgeArg0) {
      return this.a6(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean containsKey(String bridgeArg0) {
      return this.n5(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void addItem(String bridgeArg0, String bridgeArg1) {
      this.u3(bridgeArg0, bridgeArg1);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean removeItem(KeyValuePair<String, String> bridgeArg0) {
      return this.k5(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void copyToTArray(KeyValuePair<String, String>[] bridgeArg0, int bridgeArg1) {
      this.n5(bridgeArg0, bridgeArg1);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean containsItem(KeyValuePair<String, String> bridgeArg0) {
      return this.l6(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void addItem(KeyValuePair<String, String> bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
