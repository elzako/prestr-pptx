package com.aspose.slides.internal.b0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.e1x.x8;
import com.aspose.slides.internal.t5n.l6$n5;
import com.aspose.slides.ms.System.IDisposable;

public class k5 {
   private static final Dictionary<Integer, i1> n5 = new Dictionary<>();
   private static final Dictionary<String, String> l6 = new Dictionary<>();
   private static final Dictionary<String, String> k5 = new Dictionary<>();
   private static final Dictionary<String, String> u3 = new Dictionary<>();
   private static final Dictionary<String, String> a6 = new Dictionary<>();

   public static i1 n5(l6$n5 var0) {
      i1 var1 = null;
      String var2 = var0.e2;
      if (!"".equals(var2)) {
         int var3 = com.aspose.slides.internal.b0.l6.k5(var0);
         var1 = n5(var2, var3);
         if (var1 == null) {
            if (var0.t2 == -128) {
               var1 = n5(var2, var3, l6);
            } else if (var0.t2 == -127 || var0.t2 == -126) {
               var1 = n5(var2, var3, k5);
            } else if (var0.t2 == -122) {
               var1 = n5(var2, var3, u3);
            } else if (var0.t2 == -120) {
               var1 = n5(var2, var3, a6);
            }
         }
      }

      if (var1 == null) {
         var1 = l6(var0);
      }

      return var1;
   }

   private static i1 n5(String var0, int var1, Dictionary<String, String> var2) {
      i1 var3 = null;
      if (var2.containsKey(var0)) {
         var3 = n5((String)var2.get_Item(var0), var1);
         if (var3 == null) {
            Dictionary$ValueCollection$Enumerator var4 = var2.getValues().iterator();

            try {
               while (var4.hasNext()) {
                  String var5 = (String)var4.next();
                  var3 = n5(var5, var1);
                  if (var3 != null) {
                     break;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      }

      return var3;
   }

   private static i1 n5(String var0, int var1) {
      return x8.u3().n5(var0, var1);
   }

   private static i1 l6(l6$n5 var0) {
      i1 var1 = null;
      int var2 = com.aspose.slides.internal.b0.u3.n5.n5(var0);
      if (n5.containsKey(var2)) {
         return n5.get_Item(var2);
      }

      var1 = com.aspose.slides.internal.b0.n5.n5(x8.u3(), var0);
      if (var1 != null) {
         n5.addItem(var2, var1);
      }

      if (var1 == null) {
         var1 = x8.u3().n5("Arial", com.aspose.slides.internal.b0.l6.k5(var0), null);
      }

      return var1;
   }

   static {
      l6.addItem("ＭＳ Ｐゴシック", "MS PGothic");
      l6.addItem("ＭＳ Ｐ明朝", "MS PMincho");
      l6.addItem("ＭＳ ゴシック", "MS Gothic");
      l6.addItem("ＭＳ 明朝", "MS Mincho");
      k5.addItem("굴림체", "GulimChe");
      k5.addItem("바탕체", "BatangChe");
      k5.addItem("돋움체", "DotumChe");
      k5.addItem("궁서체", "GungsuhChe");
      k5.addItem("바탕", "Batang");
      k5.addItem("굴림", "Gulim");
      k5.addItem("돋움", "Dotum");
      k5.addItem("궁서", "Gungsuh");
      k5.addItem("휴먼아미체", "Ami R");
      k5.addItem("HY목각파임B", "HYPMokGak-Bold");
      k5.addItem("HY얕은샘물M", "HYShortSamul-Medium");
      k5.addItem("HY엽서M", "HYPost-Medium");
      k5.addItem("휴먼둥근헤드라인", "Headline R");
      k5.addItem("휴먼편지체", "Pyunji R");
      k5.addItem("HY견고딕", "HYGothic-Extra");
      k5.addItem("HY신문명조", "HYSinMun-MyeongJo");
      k5.addItem("HY견명조", "HYMyeongJo-Extra");
      k5.addItem("HY타자M", "HYTaJa-Medium");
      k5.addItem("휴먼각진헤드라인", "Headline Sans R");
      k5.addItem("휴먼옛체", "Yet R");
      u3.addItem("宋体", "SimSun");
      u3.addItem("黑体", "SimHei");
      u3.addItem("仿宋_GB2312", "FangSong_GB2312");
      u3.addItem("楷体_GB2312", "KaiTi_GB2312");
      u3.addItem("幼圆", "YouYuan");
      u3.addItem("华文宋体", "STSong");
      u3.addItem("华文中宋", "STZhongsong");
      u3.addItem("华文楷体", "STKaiti");
      u3.addItem("华文仿宋", "STFangsong");
      u3.addItem("华文细黑", "STXihei");
      u3.addItem("华文隶书", "STLiti");
      u3.addItem("华文行楷", "STXingkai");
      u3.addItem("华文新魏", "STXinwei");
      u3.addItem("华文琥珀", "STHupo");
      u3.addItem("华文彩云", "STCaiyun");
      u3.addItem("方正姚体简体", "FZYaoTi");
      u3.addItem("方正舒体简体", "FZShuTi");
      u3.addItem("新宋体", "NSimSun");
      u3.addItem("隶书", "LiSu");
      a6.addItem("新細明體", "PMingLiu");
      a6.addItem("細明體", "MingLiu");
      a6.addItem("華康儷粗黑", "DFLiHeiBold(P)");
      a6.addItem("華康新儷粗黑", "DFLiHeiBold");
      a6.addItem("標楷體", "DFKai-SB");
   }
}
