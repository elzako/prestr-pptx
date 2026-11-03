package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class j9u extends b3 {
   private Dictionary<String, String> n5;
   private String l6;
   private String k5;
   private String u3;
   private List<w1j> a6;
   private k8l u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "Ignorable", "MustUnderstand", "ProcessContent", "Choice", "Fallback"
   );

   public j9u(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      j9u$1 var2 = new j9u$1(this);
      n5(var1, var2);
      n5(var1, new j9u$2(this, var1));
   }

   public j9u() {
      this.u9();
   }

   private void u9() {
      this.n5 = new Dictionary<>();
      this.a6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      Dictionary$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            KeyValuePair var5 = (KeyValuePair)var4.next();
            if (!com.aspose.slides.ms.System.d1.a6(var2.n5((String)var5.getValue()), (String)var5.getKey())) {
               var2.u3("xmlns", (String)var5.getKey(), null, (String)var5.getValue());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.l6 != null) {
         var2.l6("mc:Ignorable", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("mc:MustUnderstand", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("mc:ProcessContent", this.u3);
      }

      List$Enumerator var14 = this.a6.iterator();

      try {
         while (var14.hasNext()) {
            w1j var6 = (w1j)var14.next();
            var6.n5("mc", var2, "Choice");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      if (this.u9 != null) {
         this.u9.n5("mc", var2, "Fallback");
      }

      var2.s7();
   }

   public final void n5(String var1, String var2) {
      this.n5.addItem(var1, var2);
   }

   public final w1j n5() {
      w1j var1 = new w1j();
      this.a6.addItem(var1);
      return var1;
   }

   public final k8l l6() {
      if (this.u9 != null) {
         throw new Exception("Only one <fallback> element can be added.");
      }

      this.u9 = new k8l();
      return this.u9;
   }

   public final w1j[] k5() {
      return this.a6.toArray(new w1j[0]);
   }

   public final k8l u3() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(j9u var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(j9u var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(j9u var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static List n5(j9u var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static k8l n5(j9u var0, k8l var1) {
      return var0.u9 = var1;
   }
}
