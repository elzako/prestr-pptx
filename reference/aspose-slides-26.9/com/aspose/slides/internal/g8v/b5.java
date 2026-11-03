package com.aspose.slides.internal.g8v;

import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.Specialized.HybridDictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NotSupportedException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.util.List;

@com.aspose.slides.ms.System.j3
public abstract class b5 implements com.aspose.slides.internal.h3d.s7 {
   static HybridDictionary u3 = new HybridDictionary();
   static boolean a6;
   static v4 u9;
   static final Object h0 = new Object();

   protected b5() {
   }

   static Exception y1() {
      return new NotImplementedException("This method must be implemented in derived classes");
   }

   public long a6() {
      throw y1();
   }

   public f2 h0() {
      throw y1();
   }

   public void n5(f2 var1) {
      throw y1();
   }

   public y5 c8() {
      throw y1();
   }

   public String n3() {
      throw y1();
   }

   public void n5(String var1) {
      throw y1();
   }

   public v4 y4() {
      throw y1();
   }

   public void n5(v4 var1) {
      throw y1();
   }

   public com.aspose.slides.ms.System.r8 e2() {
      throw y1();
   }

   public static v4 a0() {
      if (!a6) {
         synchronized (h0) {
            if (u9 == null) {
               u9 = d2();
            }
         }
      }

      return u9;
   }

   static v4 d2() {
      return d5();
   }

   public void r4() {
      throw y1();
   }

   public com.aspose.slides.ms.System.z7 n5(com.aspose.slides.ms.System.h0 var1, Object var2) {
      throw y1();
   }

   public static b5 l6(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("requestUriString");
      } else {
         return n5(new com.aspose.slides.ms.System.r8(var0));
      }
   }

   public static b5 n5(com.aspose.slides.ms.System.r8 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("requestUri");
      } else {
         return k5(var0.l6()).n5(var0);
      }
   }

   public u8 n5(com.aspose.slides.ms.System.z7 var1) {
      throw y1();
   }

   public u8 z8() {
      throw y1();
   }

   public static v4 d5() {
      ProxySelector var0 = ProxySelector.getDefault();

      try {
         List var1 = ProxySelector.getDefault().select(new URI("http://google.com/"));
         Proxy var2 = null;

         for (Object recoveredElement$var4$2556 : var1) {
            Proxy var4 = (Proxy)recoveredElement$var4$2556;
            if (var4.address() != null) {
               var2 = var4;
               break;
            }
         }

         if (var2 != null) {
            InetSocketAddress var6 = (InetSocketAddress)var2.address();
            return new k8(var6.getHostName(), var6.getPort());
         } else {
            return k7.l6();
         }
      } catch (java.lang.Exception var5) {
         return k7.l6();
      }
   }

   @Override
   public void getObjectData(com.aspose.slides.internal.h3d.c4 serializationInfo, com.aspose.slides.internal.h3d.s3 streamingContext) {
      throw y1();
   }

   public static boolean n5(String var0, u6 var1) {
      if (var0 == null) {
         throw new ArgumentNullException("prefix");
      }

      if (var1 == null) {
         throw new ArgumentNullException("creator");
      }

      synchronized (u3.getSyncRoot()) {
         String var3 = com.aspose.slides.ms.System.d1.n5(var0, com.aspose.slides.internal.x7n.l6.k5());
         if (u3.contains(var3)) {
            return false;
         }

         u3.addItem(var3, var1);
         return true;
      }
   }

   private static u6 k5(String var0) {
      int var1 = -1;
      u6 var2 = null;
      var0 = com.aspose.slides.ms.System.d1.n5(var0, com.aspose.slides.internal.x7n.l6.k5());
      IDictionaryEnumerator var3 = u3.iterator();

      while (var3.hasNext()) {
         String var4 = com.aspose.slides.internal.v6g.k5.n5(var3.getKey(), String.class);
         if (var4.length() > var1 && com.aspose.slides.ms.System.d1.l6(var0, var4)) {
            var1 = var4.length();
            var2 = (u6)var3.getValue();
         }
      }

      if (var2 == null) {
         throw new NotSupportedException(var0);
      } else {
         return var2;
      }
   }

   static {
      z8 var0 = new z8();
      n5("http", var0);
      n5("https", var0);
      n5("file", new z3());
      n5("ftp", new m1());
   }
}
