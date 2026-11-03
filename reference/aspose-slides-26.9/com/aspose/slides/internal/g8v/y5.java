package com.aspose.slides.internal.g8v;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Specialized.NameObjectCollectionBase$KeysCollection;
import com.aspose.slides.Collections.Specialized.NameValueCollection;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;

@com.aspose.slides.ms.System.j3
public class y5 extends NameValueCollection implements com.aspose.slides.internal.h3d.s7 {
   static final boolean[] n5 = new boolean[]{
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      true,
      false,
      true,
      true,
      true,
      true,
      false,
      false,
      false,
      true,
      true,
      false,
      true,
      true,
      false,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      false,
      false,
      false,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      false,
      true,
      false
   };
   static final Dictionary<String, Integer> l6 = new Dictionary<>(com.aspose.slides.ms.System.p6.u3());
   private int k5 = 0;
   private int u3 = 0;

   public y5() {
   }

   y5(int var1) {
      this.k5 = var1;
   }

   public void n5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("header");
      }

      int var2 = com.aspose.slides.ms.System.d1.u3(var1, ':');
      if (var2 == -1) {
         throw new ArgumentException("no colon found", "header");
      }

      this.add(com.aspose.slides.ms.System.d1.l6(var1, 0, var2), com.aspose.slides.ms.System.d1.k5(var1, var2 + 1));
   }

   @Override
   public void add(String name, String value) {
      if (name == null) {
         throw new ArgumentNullException("name");
      }

      this.h0(name);
      this.l6(name, value);
   }

   protected void l6(String var1, String var2) {
      if (!u9(var1)) {
         throw new ArgumentException(com.aspose.slides.ms.System.d1.n5(new String[]{"invalid header name: ", var1}), "headerName");
      }

      if (var2 == null) {
         var2 = com.aspose.slides.ms.System.d1.n5;
      } else {
         var2 = com.aspose.slides.ms.System.d1.l6(var2);
      }

      if (!a6(var2)) {
         throw new ArgumentException(com.aspose.slides.ms.System.d1.n5(new String[]{"invalid header value: ", var2}), "headerValue");
      }

      this.k5(var1, var2);
   }

   void k5(String var1, String var2) {
      super.add(var1, var2);
   }

   String[] n5(String var1, boolean var2) {
      if (var1 == null) {
         throw new ArgumentNullException("header");
      }

      String[] var3 = super.getValues(var1);
      if (var3 != null && com.aspose.slides.ms.System.u3.n5((Object)(var3)).a6() != 0) {
         if (var2 && u3(var1)) {
            List var4 = null;

            for (String var8 : var3) {
               if (com.aspose.slides.ms.System.d1.u3(var8, ',') >= 0) {
                  if (var4 == null) {
                     var4 = new List(com.aspose.slides.ms.System.u3.n5((Object)(var3)).a6() + 1);

                     for (String var12 : var3) {
                        if (com.aspose.slides.ms.System.d1.a6(var12, var8)) {
                           break;
                        }

                        var4.addItem(var12);
                     }
                  }

                  String[] var13 = com.aspose.slides.ms.System.d1.n5(var8, ',');
                  int var14 = com.aspose.slides.ms.System.u3.n5((Object)(var13)).a6();
                  if (var8.charAt(var8.length() - 1) == ',') {
                     var14--;
                  }

                  for (int var15 = 0; var15 < var14; var15++) {
                     var4.addItem(com.aspose.slides.ms.System.d1.l6(var13[var15]));
                  }
               }
            }

            if (var4 != null) {
               return (String[])var4.toArray(new String[0]);
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   @Override
   public String[] getValues(String header) {
      return this.n5(header, true);
   }

   @Override
   public String[] getValues(int index) {
      String[] var2 = super.getValues(index);
      return var2 != null && com.aspose.slides.ms.System.u3.n5((Object)(var2)).a6() != 0 ? var2 : null;
   }

   @Override
   public void remove(String name) {
      if (name == null) {
         throw new ArgumentNullException("name");
      }

      this.h0(name);
      super.remove(name);
   }

   @Override
   public void set(String name, String value) {
      if (name == null) {
         throw new ArgumentNullException("name");
      }

      if (!u9(name)) {
         throw new ArgumentException("invalid header name");
      }

      if (value == null) {
         value = com.aspose.slides.ms.System.d1.n5;
      } else {
         value = com.aspose.slides.ms.System.d1.l6(value);
      }

      if (!a6(value)) {
         throw new ArgumentException("invalid header value");
      }

      this.h0(name);
      super.set(name, value);
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      int var2 = super.size();

      for (int var3 = 0; var3 < var2; var3++) {
         var1.n5(this.getKey(var3)).n5(": ").n5(this.get(var3)).n5("\r\n");
      }

      return var1.n5("\r\n").toString();
   }

   @Override
   public void getObjectData(com.aspose.slides.internal.h3d.c4 serializationInfo, com.aspose.slides.internal.h3d.s3 streamingContext) {
      int var3 = super.size();
      serializationInfo.n5("Count", var3);

      for (int var4 = 0; var4 < var3; var4++) {
         serializationInfo.n5(com.aspose.slides.ms.System.a3.l6(var4), this.getKey(var4));
         serializationInfo.n5(com.aspose.slides.ms.System.a3.l6(var3 + var4), this.get(var4));
      }
   }

   @Override
   public String[] getAllKeys() {
      return super.getAllKeys();
   }

   @Override
   public int size() {
      return super.size();
   }

   @Override
   public NameObjectCollectionBase$KeysCollection getKeys() {
      return super.getKeys();
   }

   @Override
   public String get(int index) {
      return super.get(index);
   }

   @Override
   public String get(String name) {
      return super.get(name);
   }

   @Override
   public String getKey(int index) {
      return super.getKey(index);
   }

   @Override
   public void clear() {
      super.clear();
   }

   @Override
   public IEnumerator iterator() {
      return super.iterator();
   }

   void l6(String var1) {
      int var2 = com.aspose.slides.ms.System.d1.u3(var1, ':');
      if (var2 == -1) {
         throw new ArgumentException("no colon found", "header");
      }

      this.u3(com.aspose.slides.ms.System.d1.l6(var1, 0, var2), com.aspose.slides.ms.System.d1.k5(var1, var2 + 1));
   }

   void u3(String var1, String var2) {
      if (var2 == null) {
         var2 = com.aspose.slides.ms.System.d1.n5;
      } else {
         var2 = com.aspose.slides.ms.System.d1.l6(var2);
      }

      if (!a6(var2)) {
         throw new ArgumentException("invalid header value");
      }

      if (u3(var1)) {
         super.add(var1, var2);
      } else {
         super.remove(var1);
         super.set(var1, var2);
      }
   }

   void a6(String var1, String var2) {
      if (var2 == null) {
         var2 = com.aspose.slides.ms.System.d1.n5;
      } else {
         var2 = com.aspose.slides.ms.System.d1.l6(var2);
      }

      super.remove(var1);
      super.set(var1, var2);
   }

   void k5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("name");
      }

      super.remove(var1);
   }

   private void h0(String var1) {
      if (this.k5 != 0) {
         int var2 = 0;
         Integer[] var3 = new Integer[]{var2};
         boolean var4 = !l6.tryGetValue(var1, var3);
         var2 = var3[0];
         if (!var4) {
            if ((var2 & this.k5) != 0) {
               throw new ArgumentException("This header must be modified with the appropiate property.");
            }
         }
      }
   }

   static boolean u3(String var0) {
      if (var0 == null) {
         return false;
      }

      byte var1 = 0;
      Integer[] var2 = new Integer[]{Integer.valueOf(var1)};
      return l6.tryGetValue(var0, var2) && (var2[0] & 1024) != 0;
   }

   static boolean a6(String var0) {
      int var1 = var0.length();

      for (int var2 = 0; var2 < var1; var2++) {
         char var3 = var0.charAt(var2);
         if (var3 == 127) {
            return false;
         }

         if (var3 < ' ' && var3 != '\r' && var3 != '\n' && var3 != '\t') {
            return false;
         }

         if (var3 == '\n') {
            if (++var2 < var1) {
               var3 = var0.charAt(var2);
               if (var3 != ' ' && var3 != '\t') {
                  return false;
               }
            }
         }
      }

      return true;
   }

   static boolean u9(String var0) {
      if (var0 != null && var0.length() != 0) {
         int var1 = var0.length();

         for (int var2 = 0; var2 < var1; var2++) {
            char var3 = var0.charAt(var2);
            if (var3 > '~' || !n5[com.aspose.slides.internal.v6g.k5.u3(var3, 4)]) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static {
      l6.addItem("Allow", 1024);
      l6.addItem("Accept", 1025);
      l6.addItem("Accept-Charset", 1024);
      l6.addItem("Accept-Encoding", 1024);
      l6.addItem("Accept-Language", 1024);
      l6.addItem("Accept-Ranges", 1024);
      l6.addItem("Authorization", 1024);
      l6.addItem("Cache-Control", 1024);
      l6.addItem("Cookie", 1024);
      l6.addItem("Connection", 1025);
      l6.addItem("Content-Encoding", 1024);
      l6.addItem("Content-Length", 3);
      l6.addItem("Content-Type", 1);
      l6.addItem("Content-Language", 1024);
      l6.addItem("Date", 1);
      l6.addItem("Expect", 1025);
      l6.addItem("Host", 1);
      l6.addItem("If-Match", 1024);
      l6.addItem("If-Modified-Since", 1);
      l6.addItem("If-None-Match", 1024);
      l6.addItem("Keep-Alive", 2);
      l6.addItem("Pragma", 1024);
      l6.addItem("Proxy-Authenticate", 1024);
      l6.addItem("Proxy-Authorization", 1024);
      l6.addItem("Proxy-Connection", 1025);
      l6.addItem("Range", 1025);
      l6.addItem("Referer", 1);
      l6.addItem("Set-Cookie", 1024);
      l6.addItem("Set-Cookie2", 1024);
      l6.addItem("TE", 1024);
      l6.addItem("Trailer", 1024);
      l6.addItem("Transfer-Encoding", 1027);
      l6.addItem("Upgrade", 1024);
      l6.addItem("User-Agent", 1);
      l6.addItem("Vary", 1024);
      l6.addItem("Via", 1024);
      l6.addItem("Warning", 1024);
      l6.addItem("WWW-Authenticate", 1026);
   }
}
