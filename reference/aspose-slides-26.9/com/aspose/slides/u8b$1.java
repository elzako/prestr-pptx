package com.aspose.slides;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import java.util.Comparator;

class u8b$1 implements Comparator<KeyValuePair<byte[], String>> {
   // $VF: synthetic field
   final u8b n5;

   u8b$1(u8b var1) {
      this.n5 = var1;
   }

   public int n5(KeyValuePair<byte[], String> var1, KeyValuePair<byte[], String> var2) {
      return ((String)var1.getValue()).compareTo((String)var2.getValue());
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compare(KeyValuePair<byte[], String> bridgeArg0, KeyValuePair<byte[], String> bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }

}
