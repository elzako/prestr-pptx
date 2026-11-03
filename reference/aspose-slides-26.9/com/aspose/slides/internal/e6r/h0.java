package com.aspose.slides.internal.e6r;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.z4.a0;
import com.aspose.slides.internal.z4.t4;
import com.aspose.slides.ms.System.IDisposable;

public class h0 extends a0 {
   private Dictionary<String, String> n5 = new Dictionary<>();

   public h0(com.aspose.slides.internal.z4.c8 var1) {
      super(var1);
      this.n5("/Header", "/Sect");
      this.n5("/Footer", "/Sect");
      this.n5("/Textbox", "/Sect");
      this.n5("/Diagram", "/Figure");
      this.n5("/Artifact", "/Sect");
      this.n5("/Slide", "/Part");
      this.n5("/Presentation", "/Document");
   }

   @Override
   public void n5(t4 var1) {
      var1.n5(this);
      var1.c8();
      Dictionary$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            var1.k5((String)var3.getKey(), (String)var3.getValue());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      var1.t2();
      var1.l6();
   }

   private void n5(String var1, String var2) {
      this.n5.addItem(var1, var2);
   }
}
