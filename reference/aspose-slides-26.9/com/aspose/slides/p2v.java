package com.aspose.slides;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

abstract class p2v {
   private boolean n5;
   private static final Dictionary<String, Boolean> l6 = new Dictionary<>(com.aspose.slides.ms.System.p6.l6());
   private static final Dictionary<String, Boolean> k5 = new Dictionary<>(com.aspose.slides.ms.System.p6.l6());
   private static final Dictionary<String, Character> u3 = new Dictionary<>(com.aspose.slides.ms.System.p6.l6());
   private static final Dictionary<String, Boolean> a6 = new Dictionary<>(com.aspose.slides.ms.System.p6.l6());
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("pre", "script", "style", "plaintext", "img", "body");

   abstract void n5(String var1);

   abstract void n5(String var1, IGenericDictionary<String, String> var2);

   abstract void l6(String var1);

   abstract void n5(String var1, String var2);

   abstract void n5(com.aspose.slides.internal.h6.n5 var1);

   void l6(String var1, String var2) {
   }

   final void k5(String var1) {
      char[] var2 = com.aspose.slides.ms.System.d1.c8(var1);
      String var3 = "<body>";
      String var4 = "</body>";
      char[] var5 = var2;

      while (true) {
         boolean var6 = false;
         boolean[] var7 = new boolean[]{false};
         List var8 = this.n5(var5, 0, var5.length, var7);
         var6 = var7[0];
         if (var6) {
            n5(var8, var5);
            this.l6(var8, var5);
            return;
         }

         var5 = new char[var2.length + "<body>".length() + "</body>".length()];
         com.aspose.slides.ms.System.d1.n5("<body>", 0, var5, 0, "<body>".length());
         com.aspose.slides.ms.System.u3.n5((Object)(var2)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var5)), "<body>".length());
         com.aspose.slides.ms.System.d1.n5("</body>", 0, var5, "<body>".length() + var2.length, "</body>".length());
      }
   }

   final void n5(com.aspose.slides.internal.f5.r4 var1) {
      boolean var2 = com.aspose.slides.ms.System.d1.u3(var1.t2(), "body", (short)3);
      if (!var2) {
         this.n5("body", new Dictionary<>());
      }

      this.l6(var1);
      if (!var2) {
         this.l6("body");
      }
   }

   final void n5(com.aspose.slides.internal.h6.n5 var1, IGenericList<com.aspose.slides.internal.j3.z8> var2) {
      boolean var3 = com.aspose.slides.ms.System.d1.u3(var1.t2(), "body", (short)3);
      if (!var3) {
         this.n5("body", new Dictionary<>());
      }

      this.n5(var1.t2(), this.l6(var1));
      IGenericEnumerator var4 = var2.iterator();

      try {
         while (var4.hasNext()) {
            com.aspose.slides.internal.f5.r4 var5 = (com.aspose.slides.internal.f5.r4)var4.next();
            this.l6(var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      this.l6(var1.t2());
      if (!var3) {
         this.l6("body");
      }
   }

   private IGenericDictionary<String, String> l6(com.aspose.slides.internal.h6.n5 var1) {
      Dictionary var2 = new Dictionary();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.w8.t4.class)) {
         this.n5((com.aspose.slides.internal.w8.t4)var1, var2);
      }

      if (var1.A_() != null) {
         IEnumerator var3 = var1.A_().iterator();

         try {
            while (var3.hasNext()) {
               com.aspose.slides.internal.j3.z8 var4 = (com.aspose.slides.internal.j3.z8)var3.next();
               com.aspose.slides.internal.j3.k5 var5 = (com.aspose.slides.internal.j3.k5)var4;
               var2.set_Item(var5.t2(), var5.k5());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               ((IDisposable)var3).dispose();
            }
         }
      }

      com.aspose.slides.internal.w5.k5 var9 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.w5.k5.class);
      if (var9 != null) {
         var2.set_Item("style", var9.a3().y8());
      }

      return var2;
   }

   private void n5(com.aspose.slides.internal.w8.t4 var1, IGenericDictionary<String, String> var2) {
      var2.set_Item("color", var1.j9());
      var2.set_Item("face", var1.z6());
      var2.set_Item("size", var1.e9());
   }

   private void l6(com.aspose.slides.internal.f5.r4 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.h6.n5.class)) {
         com.aspose.slides.internal.h6.n5 var2 = (com.aspose.slides.internal.h6.n5)var1;
         this.n5(var2.t2(), this.l6(var2));
         if ("math".equals(var2.t2())) {
            this.n5(var2);
         } else {
            IGenericEnumerator var3 = var1.y1().iterator();

            try {
               while (var3.hasNext()) {
                  com.aspose.slides.internal.j3.z8 var4 = (com.aspose.slides.internal.j3.z8)var3.next();
                  this.l6((com.aspose.slides.internal.f5.r4)var4);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
               }
            }
         }

         this.l6(var2.t2());
      } else if (!com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.j3.c4.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.j3.a6.class)) {
         if (!com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.j3.h0.class)) {
            IGenericEnumerator var14 = var1.y1().iterator();

            try {
               while (var14.hasNext()) {
                  com.aspose.slides.internal.j3.z8 var15 = (com.aspose.slides.internal.j3.z8)var14.next();
                  this.l6((com.aspose.slides.internal.f5.r4)var15);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
                  var14.dispose();
               }
            }
         }
      } else if (var1.y2() == null || var1.y2() != null && !com.aspose.slides.ms.System.d1.a6("style", var1.y2().t2())) {
         com.aspose.slides.internal.j3.u9 var13 = (com.aspose.slides.internal.j3.u9)var1;
         this.n5(com.aspose.slides.internal.h3r.n5.n5(var13.n5()));
      }
   }

   private List<p2v$k5> n5(char[] var1, int var2, int var3, boolean[] var4) {
      List var5 = new List();
      var4[0] = false;
      int var6 = var2 + var3;
      int var7 = var2;

      while (var7 < var6) {
         int var8 = var7;

         while (var7 < var6 && var1[var7] != '<') {
            var7++;
         }

         if (var8 < var7) {
            var5.addItem(new p2v$u3(var8, var7));
         }

         if (var7 < var6 && var1[var7] == '<') {
            int var9 = var7++;
            char var10 = var1[var7++];
            char var11 = ' ';
            int var12;
            switch (var10) {
               case '!':
                  var10 = var1[var7++];
                  if (var10 == '[') {
                     for (int var25 = 1; var7 < var6 && var25 > 0; var7++) {
                        if (var1[var7] == '[') {
                           var25++;
                        } else if (var1[var7] == ']') {
                           var25--;
                        }
                     }

                     if (var7 < var6 && var1[var7] == '>') {
                        var7++;
                     }
                     continue;
                  }

                  if (var10 != '-' || var1[var7] != '-') {
                     continue;
                  }

                  for (char var23 = var1[var7++]; var7 < var6 && (var23 != '-' || var11 != '-'); var23 = var1[var7++]) {
                     var11 = var23;
                  }

                  if (var7 < var6) {
                     var7++;
                  }
                  continue;
               case '/':
                  var12 = var7;

                  while (var7 < var6 && var1[var7] > ' ' && var1[var7] != '>') {
                     var7++;
                  }

                  int var26 = var7;
                  if (var7 < var6 && var1[var7] == '>') {
                     var5.addItem(new p2v$n5(var9, ++var7, var1, var12, var26));
                     continue;
                  }

                  var5.addItem(new p2v$u3(var9, var7));
                  continue;
               case '?':
                  while ((var10 != '>' || var11 != '?') && (var10 != '>' || var11 != '/')) {
                     var11 = var10;
                     if (var7 >= var6) {
                        throw new PptxReadException("EOF in processing directive.");
                     }

                     var10 = var1[var7++];
                  }
                  continue;
               default:
                  var12 = --var7;
            }

            while (var7 < var6 && var1[var7] > ' ' && var1[var7] != '/' && var1[var7] != '>') {
               var7++;
            }

            int var13 = var7;
            boolean var14 = false;

            while (var7 < var6 && var1[var7] <= ' ') {
               var7++;
            }

            Dictionary var15 = new Dictionary();

            while (var7 < var6 && var1[var7] != '/' && var1[var7] != '>') {
               int var16 = var7;

               while (var7 < var6 && var1[var7] > ' ' && var1[var7] != '=' && var1[var7] != '>') {
                  var7++;
               }

               int var17 = var7;

               while (var7 < var6 && var1[var7] <= ' ') {
                  var7++;
               }

               if (var7 >= var6 || var1[var7] == '>') {
                  break;
               }

               if (var1[var7] == '=') {
                  var7++;

                  while (var7 < var6 && var1[var7] <= ' ') {
                     var7++;
                  }

                  int var19;
                  int var20;
                  if (var7 >= var6 || var1[var7] != '\'' && var1[var7] != '"') {
                     var19 = var7;

                     while (var7 < var6 && var1[var7] > ' ' && var1[var7] != '>') {
                        var7++;
                     }

                     var20 = var7;
                  } else {
                     char var18 = var1[var7++];
                     var19 = var7;

                     while (
                        var7 < var6
                           && (
                              var1[var7] != var18
                                 || var1[var7] == var18
                                    && var7 + 1 < var6
                                    && var1[var7 + 1] != '\r'
                                    && var1[var7 + 1] != '\n'
                                    && var1[var7 + 1] != ' '
                                    && var1[var7 + 1] != '>'
                                    && var1[var7 + 1] != '/'
                           )
                     ) {
                        var7++;
                     }

                     var20 = var7;
                  }

                  var15.set_Item(com.aspose.slides.ms.System.d1.n5(var1, var16, var17 - var16), this.n5(var1, var19, var20 - var19));
               }

               while (var7 < var6 && var1[var7] <= ' ') {
                  var7++;
               }
            }

            if (var7 < var6 && var1[var7] == '/') {
               var7++;
               var14 = true;
            }

            if (var7 < var6) {
               var7++;
            }

            p2v$l6 var27 = new p2v$l6(var9, var7, var1, var12, var13, var15, var14);
            var5.addItem(var27);
            if (!var4[0]) {
               var4[0] = com.aspose.slides.ms.System.d1.u3(var27.n5, "body", (short)4);
            }

            if (!var27.k5 && a6.containsKey(var27.n5)) {
               int var28 = var7;

               while (var7 + 1 < var6) {
                  if (var1[var7] == '<'
                     && var1[var7 + 1] == '/'
                     && var7 + 2 + var27.n5.length() < var6
                     && com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.n5(var1, var7 + 2, var27.n5.length()), var27.n5, (short)3) == 0) {
                     int var29 = var7 + 2 + var27.n5.length();

                     while (var29 < var6 && var1[var29] <= ' ') {
                        var29++;
                     }

                     if (var1[var29] == '>') {
                        if (var28 < var7) {
                           p2v$u3 var30 = new p2v$u3(var28, var7);
                           var5.addItem(var30);
                        }

                        var5.addItem(new p2v$n5(var27.n5));
                        var7 = var29 + 1;
                        break;
                     }
                  }

                  var7++;
               }
            }
         }
      }

      return var5;
   }

   private static void n5(List<p2v$k5> var0, char[] var1) {
      List var2 = new List();
      List var3 = new List();
      List var4 = new List();

      for (int var5 = 0; var5 < var0.size(); var5++) {
         if (com.aspose.slides.internal.v6g.k5.l6(var0.get_Item(var5), p2v$l6.class)) {
            p2v$l6 var14 = (p2v$l6)var0.get_Item(var5);
            var3.addItem(var14);
            if (!var14.k5 && !l6.containsKey(var14.n5)) {
               var2.addItem(new p2v$a6(var14, var3.size() - 1));
            } else {
               var3.addItem(new p2v$n5(var14.n5));
            }
         } else if (!com.aspose.slides.internal.v6g.k5.l6(var0.get_Item(var5), p2v$n5.class)) {
            if (com.aspose.slides.internal.v6g.k5.l6(var0.get_Item(var5), p2v$u3.class)) {
               var3.addItem(var0.get_Item(var5));
            }
         } else {
            p2v$n5 var6 = (p2v$n5)var0.get_Item(var5);
            if (!l6.containsKey(var6.n5)) {
               if (var2.size() > 0 && com.aspose.slides.ms.System.d1.a6(((p2v$a6)var2.get_Item(var2.size() - 1)).n5.n5, var6.n5)) {
                  var2.removeAt(var2.size() - 1);
                  var3.addItem(var6);
               } else if (k5.containsKey(var6.n5)) {
                  int var17 = var2.size() - 1;

                  while (var17 >= 0 && !com.aspose.slides.ms.System.d1.a6(((p2v$a6)var2.get_Item(var17)).n5.n5, var6.n5)) {
                     var17--;
                  }

                  if (var17 >= 0) {
                     p2v$l6 var19 = ((p2v$a6)var2.get_Item(var17)).n5;

                     for (int var20 = var17 + 1; var20 < var2.size(); var20++) {
                        p2v$a6 var21 = (p2v$a6)var2.get_Item(var20);
                        int var11 = var21.l6;
                        n5(var3, var11, var6, var2, var20);
                        n5(var3, var11 + 2, var19, var2, var20 + 1);
                     }

                     var2.removeAt(var17);
                     var3.addItem(var6);
                  }
               } else {
                  int var7 = var2.size() - 1;

                  while (var7 >= 0 && !com.aspose.slides.ms.System.d1.a6(((p2v$a6)var2.get_Item(var7)).n5.n5, var6.n5)) {
                     var7--;
                  }

                  if (var7 >= 0) {
                     p2v$l6 var8 = ((p2v$a6)var2.get_Item(var7)).n5;

                     for (int var9 = var2.size() - 1; var9 > var7; var9--) {
                        p2v$a6 var10 = (p2v$a6)var2.get_Item(var9);
                        if (k5.containsKey(var10.n5.n5)) {
                           var4.addItem(var10.n5);
                        } else {
                           var2.removeAt(var9);
                        }

                        var3.addItem(new p2v$n5(var10.n5.n5));
                     }

                     var2.removeAt(var7);
                     var3.addItem(var6);
                     var3.addRange(var4);
                     var4.clear();
                  }
               }
            }
         }
      }

      for (int var12 = var2.size() - 1; var12 >= 0; var12--) {
         p2v$a6 var15 = (p2v$a6)var2.get_Item(var12);
         var3.addItem(new p2v$n5(var15.n5.n5));
      }

      for (int var13 = 1; var13 < var3.size(); var13++) {
         if (com.aspose.slides.internal.v6g.k5.l6(var3.get_Item(var13), p2v$n5.class)) {
            p2v$n5 var16 = (p2v$n5)var3.get_Item(var13);
            if (k5.containsKey(var16.n5) && com.aspose.slides.internal.v6g.k5.l6(var3.get_Item(var13 - 1), p2v$l6.class)) {
               p2v$l6 var18 = (p2v$l6)var3.get_Item(var13 - 1);
               if (com.aspose.slides.ms.System.d1.a6(var18.n5, var16.n5)) {
                  var3.removeAt(var13 - 1);
                  var3.removeAt(var13 - 1);
                  var13 -= 2;
               }
            }
         }
      }

      var0.clear();
      var0.setCapacity(var3.size());
      var0.addRange(var3);
   }

   private static void n5(List<p2v$k5> var0, int var1, p2v$k5 var2, List<p2v$a6> var3, int var4) {
      var0.insertItem(var1, var2);

      for (int var5 = var4; var5 < var3.size(); var5++) {
         p2v$a6 var6 = (p2v$a6)var3.get_Item(var5);
         if (var6.l6 >= var1) {
            var6.l6++;
         }
      }
   }

   private void l6(List<p2v$k5> var1, char[] var2) {
      List var3 = new List();
      p2v$u9 var4 = new p2v$u9();
      List$Enumerator var5 = var1.iterator();

      try {
         while (var5.hasNext()) {
            p2v$k5 var6 = (p2v$k5)var5.next();
            p2v$l6 var7 = com.aspose.slides.internal.v6g.k5.n5(var6, p2v$l6.class);
            if (var7 != null) {
               if (!var4.u3) {
                  this.n5(var7.n5, var7.l6);
               }

               var3.addItem(var4);
               var4 = new p2v$u9(var4);
               switch (u9.n5(var7.n5)) {
                  case 0:
                     var4.n5 = true;
                     break;
                  case 1:
                  case 2:
                     var4.n5 = true;
                     var4.l6 = true;
                     var4.k5 = true;
                     var4.a6 = "style";
                     break;
                  case 3:
                     var4.n5 = true;
                     var4.l6 = true;
                     break;
                  case 4:
                     var4.u3 = true;
                     var4.k5 = true;
                     break;
                  case 5:
                     var4.k5 = false;
               }

               String var14 = null;
               String[] var16 = new String[]{var14};
               boolean var17 = var7.l6.tryGetValue("style", var16);
               var14 = var16[0];
               if (var17) {
                  this.n5("style", var14);
               }

               if (var4.u3 || var4.n5) {
                  this.n5 = false;
               }
            } else {
               p2v$n5 var8 = com.aspose.slides.internal.v6g.k5.n5(var6, p2v$n5.class);
               if (var8 != null) {
                  var4 = (p2v$u9)var3.get_Item(var3.size() - 1);
                  if (!var4.u3) {
                     this.l6(var8.n5);
                  }

                  var3.removeAt(var3.size() - 1);
               } else {
                  p2v$u3 var9 = com.aspose.slides.internal.v6g.k5.n5(var6, p2v$u3.class);
                  if (var9 != null && !var4.u3) {
                     String var10 = this.n5(var2, var9.u3, var9.a6 - var9.u3, var4.n5, var4.l6);
                     if (var10.length() > 0) {
                        if (var4.k5) {
                           this.l6(var10, var4.a6);
                        } else {
                           this.n5(var10);
                        }
                     }
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }
   }

   private String n5(char[] var1, int var2, int var3) {
      return this.n5(var1, var2, var3, true, false);
   }

   private String n5(char[] var1, int var2, int var3, boolean var4, boolean var5) {
      com.aspose.slides.internal.l7h.a5 var6 = new com.aspose.slides.internal.l7h.a5(var3);
      int var7 = var2;
      int var8 = var7 + var3;

      while (var7 < var8) {
         char var9 = var1[var7++];
         if (!var5 && var9 == '&') {
            int var10 = var7;
            if (var1[var7] == '#') {
               int var16 = 0;
               var7++;
               if (var7 >= var8 || var1[var7] != 'x' && var1[var7] != 'X') {
                  while (var7 < var8 && var1[var7] >= '0' && var1[var7] <= '9') {
                     var16 = var16 * 10 + (var1[var7] - '0');
                     var7++;
                  }
               } else {
                  var7++;

                  for (; var7 < var8; var7++) {
                     if (var1[var7] >= '0' && var1[var7] <= '9') {
                        var16 = var16 * 16 + (var1[var7] - '0');
                     } else if (var1[var7] >= 'A' && var1[var7] <= 'F') {
                        var16 = var16 * 16 + var1[var7] - 'A' + 10;
                     } else {
                        if (var1[var7] < 'a' || var1[var7] > 'f') {
                           break;
                        }

                        var16 = var16 * 16 + var1[var7] - 'a' + 10;
                     }
                  }
               }

               if (var1[var7] == ';') {
                  var9 = (char)var16;
                  var7++;
               } else {
                  var7 = var10;
               }
            } else {
               while (var7 < var8 && var1[var7] > ' ' && var1[var7] != '&' && var1[var7] != ';') {
                  var7++;
               }

               if (var7 < var8 && var1[var7] == ';') {
                  var7++;
                  char var11 = '\u0000';
                  Character[] var12 = new Character[]{var11};
                  boolean var13 = u3.tryGetValue(com.aspose.slides.ms.System.d1.n5(var1, var10, var7 - var10 - 1), var12);
                  var11 = var12[0];
                  if (var13) {
                     var9 = var11;
                  } else {
                     var7 = var10;
                  }
               } else {
                  var7 = var10;
               }
            }
         }

         if (var9 <= ' ') {
            if (var4) {
               var6.n5(var9);
            } else if (!this.n5) {
               var6.n5(' ');
               this.n5 = true;
            }
         } else {
            var6.n5(var9);
            this.n5 = false;
         }
      }

      return var6.toString();
   }

   static {
      u3.set_Item("quot", '"');
      u3.set_Item("amp", '&');
      u3.set_Item("apos", '\'');
      u3.set_Item("lt", '<');
      u3.set_Item("gt", '>');
      u3.set_Item("nbsp", ' ');
      u3.set_Item("iexcl", '¡');
      u3.set_Item("cent", '¢');
      u3.set_Item("pound", '£');
      u3.set_Item("curren", '¤');
      u3.set_Item("yen", '¥');
      u3.set_Item("brvbar", '¦');
      u3.set_Item("sect", '§');
      u3.set_Item("uml", '¨');
      u3.set_Item("copy", '©');
      u3.set_Item("ordf", 'ª');
      u3.set_Item("laquo", '«');
      u3.set_Item("not", '¬');
      u3.set_Item("shy", '\u00ad');
      u3.set_Item("reg", '®');
      u3.set_Item("macr", '¯');
      u3.set_Item("deg", '°');
      u3.set_Item("plusmn", '±');
      u3.set_Item("sup2", '²');
      u3.set_Item("sup3", '³');
      u3.set_Item("acute", '´');
      u3.set_Item("micro", 'µ');
      u3.set_Item("para", '¶');
      u3.set_Item("middot", '·');
      u3.set_Item("cedil", '¸');
      u3.set_Item("sup1", '¹');
      u3.set_Item("ordm", 'º');
      u3.set_Item("raquo", '»');
      u3.set_Item("frac14", '¼');
      u3.set_Item("frac12", '½');
      u3.set_Item("frac34", '¾');
      u3.set_Item("iquest", '¿');
      u3.set_Item("Agrave", 'À');
      u3.set_Item("Aacute", 'Á');
      u3.set_Item("Acirc", 'Â');
      u3.set_Item("Atilde", 'Ã');
      u3.set_Item("Auml", 'Ä');
      u3.set_Item("Aring", 'Å');
      u3.set_Item("AElig", 'Æ');
      u3.set_Item("Ccedil", 'Ç');
      u3.set_Item("Egrave", 'È');
      u3.set_Item("Eacute", 'É');
      u3.set_Item("Ecirc", 'Ê');
      u3.set_Item("Euml", 'Ë');
      u3.set_Item("Igrave", 'Ì');
      u3.set_Item("Iacute", 'Í');
      u3.set_Item("Icirc", 'Î');
      u3.set_Item("Iuml", 'Ï');
      u3.set_Item("ETH", 'Ð');
      u3.set_Item("Ntilde", 'Ñ');
      u3.set_Item("Ograve", 'Ò');
      u3.set_Item("Oacute", 'Ó');
      u3.set_Item("Ocirc", 'Ô');
      u3.set_Item("Otilde", 'Õ');
      u3.set_Item("Ouml", 'Ö');
      u3.set_Item("times", '×');
      u3.set_Item("Oslash", 'Ø');
      u3.set_Item("Ugrave", 'Ù');
      u3.set_Item("Uacute", 'Ú');
      u3.set_Item("Ucirc", 'Û');
      u3.set_Item("Uuml", 'Ü');
      u3.set_Item("Yacute", 'Ý');
      u3.set_Item("THORN", 'Þ');
      u3.set_Item("szlig", 'ß');
      u3.set_Item("agrave", 'à');
      u3.set_Item("aacute", 'á');
      u3.set_Item("acirc", 'â');
      u3.set_Item("atilde", 'ã');
      u3.set_Item("auml", 'ä');
      u3.set_Item("aring", 'å');
      u3.set_Item("aelig", 'æ');
      u3.set_Item("ccedil", 'ç');
      u3.set_Item("egrave", 'è');
      u3.set_Item("eacute", 'é');
      u3.set_Item("ecirc", 'ê');
      u3.set_Item("euml", 'ë');
      u3.set_Item("igrave", 'ì');
      u3.set_Item("iacute", 'í');
      u3.set_Item("icirc", 'î');
      u3.set_Item("iuml", 'ï');
      u3.set_Item("eth", 'ð');
      u3.set_Item("ntilde", 'ñ');
      u3.set_Item("ograve", 'ò');
      u3.set_Item("oacute", 'ó');
      u3.set_Item("ocirc", 'ô');
      u3.set_Item("otilde", 'õ');
      u3.set_Item("ouml", 'ö');
      u3.set_Item("divide", '÷');
      u3.set_Item("oslash", 'ø');
      u3.set_Item("ugrave", 'ù');
      u3.set_Item("uacute", 'ú');
      u3.set_Item("ucirc", 'û');
      u3.set_Item("uuml", 'ü');
      u3.set_Item("yacute", 'ý');
      u3.set_Item("thorn", 'þ');
      u3.set_Item("yuml", 'ÿ');
      u3.set_Item("OElig", 'Œ');
      u3.set_Item("oelig", 'œ');
      u3.set_Item("Scaron", 'Š');
      u3.set_Item("scaron", 'š');
      u3.set_Item("Yuml", 'Ÿ');
      u3.set_Item("fnof", 'ƒ');
      u3.set_Item("circ", 'ˆ');
      u3.set_Item("tilde", '˜');
      u3.set_Item("Alpha", 'Α');
      u3.set_Item("Beta", 'Β');
      u3.set_Item("Gamma", 'Γ');
      u3.set_Item("Delta", 'Δ');
      u3.set_Item("Epsilon", 'Ε');
      u3.set_Item("Zeta", 'Ζ');
      u3.set_Item("Eta", 'Η');
      u3.set_Item("Theta", 'Θ');
      u3.set_Item("Iota", 'Ι');
      u3.set_Item("Kappa", 'Κ');
      u3.set_Item("Lambda", 'Λ');
      u3.set_Item("Mu", 'Μ');
      u3.set_Item("Nu", 'Ν');
      u3.set_Item("Xi", 'Ξ');
      u3.set_Item("Omicron", 'Ο');
      u3.set_Item("Pi", 'Π');
      u3.set_Item("Rho", 'Ρ');
      u3.set_Item("Sigma", 'Σ');
      u3.set_Item("Tau", 'Τ');
      u3.set_Item("Upsilon", 'Υ');
      u3.set_Item("Phi", 'Φ');
      u3.set_Item("Chi", 'Χ');
      u3.set_Item("Psi", 'Ψ');
      u3.set_Item("Omega", 'Ω');
      u3.set_Item("alpha", 'α');
      u3.set_Item("beta", 'β');
      u3.set_Item("gamma", 'γ');
      u3.set_Item("delta", 'δ');
      u3.set_Item("epsilon", 'ε');
      u3.set_Item("zeta", 'ζ');
      u3.set_Item("eta", 'η');
      u3.set_Item("theta", 'θ');
      u3.set_Item("iota", 'ι');
      u3.set_Item("kappa", 'κ');
      u3.set_Item("lambda", 'λ');
      u3.set_Item("mu", 'μ');
      u3.set_Item("nu", 'ν');
      u3.set_Item("xi", 'ξ');
      u3.set_Item("omicron", 'ο');
      u3.set_Item("pi", 'π');
      u3.set_Item("rho", 'ρ');
      u3.set_Item("sigmaf", 'ς');
      u3.set_Item("sigma", 'σ');
      u3.set_Item("tau", 'τ');
      u3.set_Item("upsilon", 'υ');
      u3.set_Item("phi", 'φ');
      u3.set_Item("chi", 'χ');
      u3.set_Item("psi", 'ψ');
      u3.set_Item("omega", 'ω');
      u3.set_Item("thetasym", 'ϑ');
      u3.set_Item("upsih", 'ϒ');
      u3.set_Item("piv", 'ϖ');
      u3.set_Item("ensp", ' ');
      u3.set_Item("emsp", ' ');
      u3.set_Item("thinsp", ' ');
      u3.set_Item("zwnj", '\u200c');
      u3.set_Item("zwj", '\u200d');
      u3.set_Item("lrm", '\u200e');
      u3.set_Item("rlm", '\u200f');
      u3.set_Item("ndash", '–');
      u3.set_Item("mdash", '—');
      u3.set_Item("lsquo", '‘');
      u3.set_Item("rsquo", '’');
      u3.set_Item("sbquo", '‚');
      u3.set_Item("ldquo", '“');
      u3.set_Item("rdquo", '”');
      u3.set_Item("bdquo", '„');
      u3.set_Item("dagger", '†');
      u3.set_Item("Dagger", '‡');
      u3.set_Item("bull", '•');
      u3.set_Item("hellip", '…');
      u3.set_Item("permil", '‰');
      u3.set_Item("prime", '′');
      u3.set_Item("Prime", '″');
      u3.set_Item("lsaquo", '‹');
      u3.set_Item("rsaquo", '›');
      u3.set_Item("oline", '‾');
      u3.set_Item("frasl", '⁄');
      u3.set_Item("euro", '€');
      u3.set_Item("image", 'ℑ');
      u3.set_Item("weierp", '℘');
      u3.set_Item("real", 'ℜ');
      u3.set_Item("trade", '™');
      u3.set_Item("alefsym", 'ℵ');
      u3.set_Item("larr", '←');
      u3.set_Item("uarr", '↑');
      u3.set_Item("rarr", '→');
      u3.set_Item("darr", '↓');
      u3.set_Item("harr", '↔');
      u3.set_Item("crarr", '↵');
      u3.set_Item("lArr", '⇐');
      u3.set_Item("uArr", '⇑');
      u3.set_Item("rArr", '⇒');
      u3.set_Item("dArr", '⇓');
      u3.set_Item("hArr", '⇔');
      u3.set_Item("forall", '∀');
      u3.set_Item("part", '∂');
      u3.set_Item("exist", '∃');
      u3.set_Item("empty", '∅');
      u3.set_Item("nabla", '∇');
      u3.set_Item("isin", '∈');
      u3.set_Item("notin", '∉');
      u3.set_Item("ni", '∋');
      u3.set_Item("prod", '∏');
      u3.set_Item("sum", '∑');
      u3.set_Item("minus", '−');
      u3.set_Item("lowast", '∗');
      u3.set_Item("radic", '√');
      u3.set_Item("prop", '∝');
      u3.set_Item("infin", '∞');
      u3.set_Item("ang", '∠');
      u3.set_Item("and", '∧');
      u3.set_Item("or", '∨');
      u3.set_Item("cap", '∩');
      u3.set_Item("cup", '∪');
      u3.set_Item("int", '∫');
      u3.set_Item("there4", '∴');
      u3.set_Item("sim", '∼');
      u3.set_Item("cong", '≅');
      u3.set_Item("asymp", '≈');
      u3.set_Item("ne", '≠');
      u3.set_Item("equiv", '≡');
      u3.set_Item("le", '≤');
      u3.set_Item("ge", '≥');
      u3.set_Item("sub", '⊂');
      u3.set_Item("sup", '⊃');
      u3.set_Item("nsub", '⊄');
      u3.set_Item("sube", '⊆');
      u3.set_Item("supe", '⊇');
      u3.set_Item("oplus", '⊕');
      u3.set_Item("otimes", '⊗');
      u3.set_Item("perp", '⊥');
      u3.set_Item("sdot", '⋅');
      u3.set_Item("lceil", '⌈');
      u3.set_Item("rceil", '⌉');
      u3.set_Item("lfloor", '⌊');
      u3.set_Item("rfloor", '⌋');
      u3.set_Item("lang", '〈');
      u3.set_Item("rang", '〉');
      u3.set_Item("loz", '◊');
      u3.set_Item("spades", '♠');
      u3.set_Item("clubs", '♣');
      u3.set_Item("hearts", '♥');
      u3.set_Item("diams", '♦');
      l6.set_Item("meta", true);
      l6.set_Item("img", true);
      k5.set_Item("i", true);
      k5.set_Item("b", true);
      k5.set_Item("em", true);
      k5.set_Item("strong", true);
      k5.set_Item("strike", true);
      k5.set_Item("dfn", true);
      k5.set_Item("code", true);
      k5.set_Item("samp", true);
      k5.set_Item("kbd", true);
      k5.set_Item("var", true);
      k5.set_Item("cite", true);
      k5.set_Item("abbr", true);
      k5.set_Item("acronym", true);
      k5.set_Item("u", true);
      k5.set_Item("s", true);
      k5.set_Item("font", true);
      k5.set_Item("sub", true);
      k5.set_Item("sup", true);
      a6.set_Item("plaintext", true);
      a6.set_Item("script", true);
   }
}
