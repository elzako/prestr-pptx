package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.ms.System.IDisposable;

public class e0 extends com.aspose.slides.ms.System.Xml.s2 {
   private x4 n5;

   public e0(x4 var1) {
      this.n5 = var1;
   }

   @Override
   public String n5(String var1) {
      if ("xml".equals(var1)) {
         return "http://www.w3.org/XML/1998/namespace";
      }

      for (x4 var2 = this.n5; var2 != null; var2 = var2.f2()) {
         Hashtable var3 = var2.i1().n5();
         if (var3 != null && var3.size() > 0) {
            Object var4 = var3.get_Item(var1);
            if (var4 != null) {
               return (String)var4;
            }
         }
      }

      return var1.length() == 0 ? com.aspose.slides.ms.System.d1.n5 : null;
   }

   @Override
   public String l6(String var1) {
      if ("http://www.w3.org/XML/1998/namespace".equals(var1)) {
         return "xml";
      }

      for (x4 var2 = this.n5; var2 != null; var2 = var2.f2()) {
         Hashtable var3 = var2.i1().n5();
         if (var3 != null && var3.size() > 0) {
            IDictionaryEnumerator var4 = var3.iterator();

            try {
               while (var4.hasNext()) {
                  DictionaryEntry var5 = (DictionaryEntry)var4.next();
                  if (var5.getValue().equals(var1)) {
                     return (String)var5.getKey();
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  ((IDisposable)var4).dispose();
               }
            }
         }
      }

      return null;
   }
}
