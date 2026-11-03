package com.aspose.slides.internal.c8m;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class a2 implements IGenericEnumerable<r7> {
   private SortedList<String, r7> n5 = new SortedList<>();
   private r7 l6;
   private int k5 = 1;
   private int u3;
   private static final char[] a6 = new char[]{'/'};
   private z6 u9;
   private Object h0 = new Object();
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9("TargetMode", "Target", "Type", "Id");

   public final r7 n5(String var1) {
      synchronized (this.h0) {
         Object var3 = null;
         r7[] var4 = new r7[]{(r7)var3};
         this.n5.tryGetValue(var1, var4);
         return var4[0];
      }
   }

   public final int n5() {
      return this.n5.size();
   }

   public a2(z6 var1) {
      this.u9 = var1;
   }

   public final r7[] n5(w4 var1) {
      synchronized (this.h0) {
         return (r7[])this.k5(var1).toArray(new r7[0]);
      }
   }

   public final r7 n5(j8 var1) {
      IGenericEnumerator var2 = this.n5.getValues().iterator();

      try {
         while (var2.hasNext()) {
            r7 var3 = (r7)var2.next();
            if (var3.k5() == var1) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   public final r7[] l6() {
      synchronized (this.h0) {
         List var2 = new List();
         IGenericEnumerator var3 = this.n5.getValues().iterator();

         try {
            while (var3.hasNext()) {
               r7 var4 = (r7)var3.next();
               if (!var4.c8()) {
                  var2.addItem(var4);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         return (r7[])var2.toArray(new r7[0]);
      }
   }

   public final void l6(w4 var1) {
      synchronized (this.h0) {
         List var3 = this.k5(var1);
         List$Enumerator var4 = var3.iterator();

         try {
            while (var4.hasNext()) {
               r7 var5 = (r7)var4.next();
               this.n5.removeItemByKey(var5.a6());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         this.u3 = this.u3 + var3.size();
      }

      this.l6 = null;
   }

   public final z6 k5() {
      return this.u9;
   }

   final void n5(com.aspose.slides.ms.System.Xml.c7 var1, String var2) {
      synchronized (this.h0) {
         var1.p8();

         for (; var1.h0() != 3; var1.u9()) {
            if (var1.s7() == 1 && "http://schemas.openxmlformats.org/package/2006/relationships".equals(var1.y4()) && "Relationship".equals(var1.n3())) {
               String var4 = null;
               String var5 = null;
               String var6 = null;
               byte var7 = -1;
               if (var1.k5()) {
                  do {
                     switch (c8.n5(var1.n3())) {
                        case 0:
                           if ("External".equals(var1.z1())) {
                              var7 = 1;
                           } else if ("Internal".equals(var1.z1())) {
                              var7 = 0;
                           }
                           break;
                        case 1:
                           var6 = var1.z1();
                           break;
                        case 2:
                           var5 = var1.z1();
                           break;
                        case 3:
                           var4 = var1.z1();
                     }
                  } while (var1.u3());

                  if (var4 != null && var5 != null && var6 != null) {
                     if (var7 != 1
                        && var6.length() > 0
                        && !com.aspose.slides.ms.System.d1.u3(var6, "NULL", (short)4)
                        && var6.charAt(0) != '/'
                        && com.aspose.slides.ms.System.d1.u9(var6, "://", (short)4) < 0) {
                        String[] var8 = com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.d1.n5(new String[]{var2, "/", var6}), a6);

                        for (int var9 = 0; var9 < var8.length; var9++) {
                           if ("..".equals(var8[var9])) {
                              var8[var9] = null;
                              int var10 = var9 - 1;

                              while (var10 > 0 && var8[var10] == null) {
                                 var10--;
                              }

                              var8[var10] = null;
                           }
                        }

                        com.aspose.slides.internal.l7h.a5 var16 = new com.aspose.slides.internal.l7h.a5();

                        for (String var13 : var8) {
                           if (!com.aspose.slides.ms.System.d1.n5(var13)) {
                              var16.n5('/');
                              var16.n5(var13);
                           }
                        }

                        if (this.k5().u9(var16.toString()) != null) {
                           var6 = var16.toString();
                        }
                     }

                     this.n5.addItem(var4, new r7(this.u9, var4, this.k5().n5(var5), var6, var7));
                  }

                  var1.a6();
               }
            }
         }
      }
   }

   final void n5(com.aspose.slides.internal.z0k.t4 var1, String var2) {
      String var3 = com.aspose.slides.ms.System.d1.l6(var2, 0, com.aspose.slides.ms.System.d1.u3(var2, "/") + 1);
      com.aspose.slides.ms.System.Xml.k3 var4 = new com.aspose.slides.ms.System.Xml.k3(var1, com.aspose.slides.internal.l7h.j5.z3());
      var4.k5(true);
      var4.l6(4);
      var4.n5(this.u9.l6() ? 1 : 0);
      var4.l6(true);
      var4.y4("Relationships");
      var4.u3("xmlns", "http://schemas.openxmlformats.org/package/2006/relationships");
      List var5 = new List<>(this.n5.getValues());
      List$Enumerator var6 = var5.iterator();

      try {
         while (var6.hasNext()) {
            r7 var7 = (r7)var6.next();
            String var8 = var7.n5();
            if (var7.h0() != 1
               && !com.aspose.slides.ms.System.d1.u3(var7.n5(), "NULL", (short)4)
               && com.aspose.slides.ms.System.d1.u9(var7.n5(), "://", (short)4) < 0) {
               if (var8 == null) {
                  continue;
               }

               int var9 = 0;
               int var10 = com.aspose.slides.ms.System.q1.l6(var3.length(), var8.length());
               int var11 = 0;

               while (var9 < var10 && var3.charAt(var9) == var8.charAt(var9)) {
                  if (var3.charAt(var9) == '/') {
                     var11 = var9;
                  }

                  var9++;
               }

               var9 = var3.length() - 2;
               com.aspose.slides.internal.l7h.a5 var12 = new com.aspose.slides.internal.l7h.a5();

               while (var9 > var11) {
                  if (var3.charAt(var9--) == '/') {
                     var12.n5("../");
                  }
               }

               var12.n5(var8, var11 + 1, var8.length() - var11 - 1);
               var8 = var12.toString();
            }

            var4.y4("Relationship");
            var4.u3("Id", var7.a6());
            var4.u3("Type", var7.u9());
            var4.u3("Target", var8);
            if (var7.h0() != -1) {
               var4.u3("TargetMode", var7.h0() == 1 ? "External" : "Internal");
            }

            var4.s7();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      var4.s7();
      var4.n5();
      var4.u9();
      var4.a6();
   }

   public final r7 l6(j8 var1) {
      var1.n5(true);
      return this.n5(var1.y4().l6().n5(), var1.l6(), (byte)-1);
   }

   public final r7 n5(String var1, String var2) {
      return this.n5(var1, var2, (byte)-1);
   }

   public final r7 n5(String var1, String var2, byte var3) {
      synchronized (this.h0) {
         if (this.l6 != null
            && com.aspose.slides.ms.System.d1.a6(this.l6.n5(), var2)
            && com.aspose.slides.ms.System.d1.a6(this.l6.u9(), var1)
            && this.l6.h0() == var3) {
            return this.l6;
         }

         IGenericEnumerator var5 = this.n5.iterator();

         try {
            while (var5.hasNext()) {
               KeyValuePair var6 = (KeyValuePair)var5.next();
               r7 var7 = (r7)var6.getValue();
               if (com.aspose.slides.ms.System.d1.a6(var7.n5(), var2) && com.aspose.slides.ms.System.d1.a6(var7.u9(), var1) && var7.h0() == var3) {
                  this.l6 = var7;
                  return var7;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }

         if (this.u3 > this.n5.size() / 5) {
            this.u3 = 0;
            this.k5 = 1;
         }

         String var16 = this.u3();
         if (this.u9.n5()) {
            String var18 = null;
            String[] var9 = new String[]{var18};
            boolean var10 = !com.aspose.slides.ms.System.d1.n5(var1) && com.aspose.slides.internal.n8e.u4.n5(var1, var9);
            var18 = var9[0];
            if (var10) {
               var1 = var18;
            }
         }

         r7 var20 = new r7(this.u9, var16, var1, var2, var3);
         this.l6 = var20;
         r7 var17 = var20;
         this.n5.set_Item(var16, var20);
         return var17;
      }
   }

   public final r7 n5(String var1, String var2, String var3, byte var4) {
      synchronized (this.h0) {
         if (this.n5.containsKey(var1)) {
            throw new Exception();
         }

         r7 var6 = new r7(this.u9, var1, var2, var3, var4);
         this.l6 = var6;
         r7 var7 = var6;
         this.n5.set_Item(var1, var6);
         return var7;
      }
   }

   private List<r7> k5(w4 var1) {
      synchronized (this.h0) {
         List var3 = new List();
         if (com.aspose.slides.ms.System.d1.u3(var1.n5(), '/') < 0) {
            IGenericEnumerator var4 = this.n5.getValues().iterator();

            try {
               while (var4.hasNext()) {
                  r7 var5 = (r7)var4.next();
                  if (com.aspose.slides.ms.System.d1.a6(var5.u3(), var1.n5())) {
                     var3.addItem(var5);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         } else {
            IGenericEnumerator var18 = this.n5.getValues().iterator();

            try {
               while (var18.hasNext()) {
                  r7 var19 = (r7)var18.next();
                  if (com.aspose.slides.ms.System.d1.a6(var19.u9(), var1.n5())) {
                     var3.addItem(var19);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
                  var18.dispose();
               }
            }
         }

         return var3;
      }
   }

   private String u3() {
      String var1;
      do {
         var1 = com.aspose.slides.ms.System.d1.n5(new String[]{"rId", com.aspose.slides.ms.System.a3.l6(this.k5++)});
      } while (this.n5.containsKey(var1));

      return var1;
   }

   @Override
   public final IGenericEnumerator<r7> iterator() {
      return this.n5.getValues().iterator();
   }
}
