package com.aspose.slides.internal.t6q;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p6;

public class h0 implements IGenericEnumerable<KeyValuePair<String, Object>>, n5 {
   protected final String n5;
   protected final String l6;
   protected Dictionary<String, Object> k5;
   private final Dictionary<String, String> u3;

   protected h0(String var1, String var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = new Dictionary<>(p6.u3());
      this.u3 = new Dictionary<>(p6.u3());
   }

   public final String l6() {
      return d1.n5("xmlns:{0}=\"{1}\"",new Object[]{ this.n5, this.l6});
   }

   public final String k5() {
      return this.n5;
   }

   public final String u3() {
      return this.l6;
   }

   protected String n5(String var1) {
      Object var2 = null;
      Object[] var3 = new Object[]{var2};
      this.k5.tryGetValue(var1, var3);
      var2 = var3[0];
      String var4 = d1.n5;
      if (var2 != null) {
         if (com.aspose.slides.internal.v6g.k5.l6(var2, n5.class)) {
            var4 = ((n5)var2).n5();
         } else if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.g4d.n5.class)) {
            var4 = ((com.aspose.slides.internal.g4d.n5)var2).n5();
         } else {
            var4 = var2.toString();
         }
      }

      return d1.n5("<{0}>{1}</{0}>",new Object[]{ var1, var4});
   }

   public Dictionary$KeyCollection<String, Object> a6() {
      return this.k5.getKeys();
   }

   public boolean l6(String var1) {
      return this.k5.containsKey(var1);
   }

   public void n5(String var1, Object var2) {
      this.k5.set_Item(var1, var2);
   }

   public void n5(String var1, String var2) {
      if (d1.n5(var1)) {
         throw new ArgumentNullException("key");
      }

      this.n5(var1, (Object)var2);
   }

   public void n5(String var1, n5 var2) {
      this.n5(var1, (Object)var2);
   }

   public void n5(String var1, com.aspose.slides.internal.g4d.l6 var2) {
      this.n5(var1, (Object)var2);
   }

   @Override
   public String n5() {
      a5 var1 = new a5();
      Dictionary$KeyCollection$Enumerator var2 = this.a6().iterator();

      try {
         while (var2.hasNext()) {
            String var3 = (String)var2.next();
            var1.n5('\n');
            String var4 = this.n5(var3);
            var1.n5(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1.toString();
   }

   @Override
   public final IGenericEnumerator<KeyValuePair<String, Object>> iterator() {
      return this.k5.iterator();
   }

   protected final void l6(String var1, String var2) {
      try {
         this.n5(var1, new com.aspose.slides.internal.c0h.n5(var2));
      } catch (ArgumentException var4) {
         this.n5(var1, new com.aspose.slides.internal.l3a.u3(var2));
      }
   }

   protected final void k5(String var1, String var2) {
      try {
         this.n5(var1, new com.aspose.slides.internal.l3a.l6(var2));
      } catch (ArgumentException var4) {
         this.n5(var1, new com.aspose.slides.internal.l3a.u3(var2));
      }
   }

   protected final void u3(String var1, String var2) {
      try {
         this.n5(var1, new com.aspose.slides.internal.l3a.k5(var2));
      } catch (ArgumentException var4) {
         this.n5(var1, new com.aspose.slides.internal.l3a.u3(var2));
      }
   }

   protected final void a6(String var1, String var2) {
      try {
         this.n5(var1, new com.aspose.slides.internal.l3a.n5(var2));
      } catch (FormatException var4) {
         this.n5(var1, new com.aspose.slides.internal.l3a.u3(var2));
      }
   }

   public final void u9(String var1, String var2) {
      if (d1.n5(var1)) {
         throw new ArgumentNullException("typePrefix");
      }

      if (d1.n5(var2)) {
         throw new ArgumentNullException("typeNamespaceUri");
      }

      this.u3.set_Item(var1, var2);
   }

   final String u9() {
      if (this.u3.size() == 0) {
         return d1.n5;
      }

      a5 var1 = new a5(" ");
      Dictionary$Enumerator var2 = this.u3.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            var1.n5("xmlns:{0}=\"{1}\"", var3.getKey(), var3.getValue());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1.toString();
   }

   public final void n5(h0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("other");
      }

      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            if (!this.l6((String)var3.getKey())) {
               this.n5((String)var3.getKey(), var3.getValue());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }
}
