package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class f7b extends b3 {
   private String n5;
   private List<s3f> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("r", "cellSmartTag");

   public f7b(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      f7b$1 var2 = new f7b$1(this);
      n5(var1, var2);
      n5(var1, new f7b$2(this, var1));
   }

   public f7b() {
      this.l6();
   }

   private void l6() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("r", this.n5);
      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            s3f var5 = (s3f)var4.next();
            var5.n5("ssml", var2, "cellSmartTag");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(f7b var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(f7b var0) {
      return var0.l6;
   }
}
