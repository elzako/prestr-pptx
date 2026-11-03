package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;

public class BehaviorProperty implements IBehaviorProperty {
   private static final Dictionary<String, BehaviorProperty> n5 = new Dictionary<>();
   private static final Object l6 = new Object();
   private final String k5;
   private final boolean u3;
   private static final BehaviorProperty a6 = new BehaviorProperty("ppt_x");
   private static final BehaviorProperty u9 = new BehaviorProperty("ppt_y");
   private static final BehaviorProperty h0 = new BehaviorProperty("ppt_w");
   private static final BehaviorProperty c8 = new BehaviorProperty("ppt_h");
   private static final BehaviorProperty t2 = new BehaviorProperty("ppt_c");
   private static final BehaviorProperty s7 = new BehaviorProperty("ppt_r");
   private static final BehaviorProperty x8 = new BehaviorProperty("xshear");
   private static final BehaviorProperty n3 = new BehaviorProperty("yshear");
   private static final BehaviorProperty y4 = new BehaviorProperty("image");
   private static final BehaviorProperty e2 = new BehaviorProperty("ScaleX");
   private static final BehaviorProperty t9 = new BehaviorProperty("ScaleY");
   private static final BehaviorProperty z1 = new BehaviorProperty("r");
   private static final BehaviorProperty t4 = new BehaviorProperty("fillcolor");
   private static final BehaviorProperty q0 = new BehaviorProperty("style.opacity");
   private static final BehaviorProperty z3 = new BehaviorProperty("style.rotation");
   private static final BehaviorProperty m1 = new BehaviorProperty("style.visibility");
   private static final BehaviorProperty k7 = new BehaviorProperty("style.color");
   private static final BehaviorProperty m3 = new BehaviorProperty("style.fontSize");
   private static final BehaviorProperty z8 = new BehaviorProperty("style.fontWeight");
   private static final BehaviorProperty j5 = new BehaviorProperty("style.fontStyle");
   private static final BehaviorProperty w1 = new BehaviorProperty("style.fontFamily");
   private static final BehaviorProperty r4 = new BehaviorProperty("style.textEffectEmboss");
   private static final BehaviorProperty c4 = new BehaviorProperty("style.textShadow");
   private static final BehaviorProperty y2 = new BehaviorProperty("style.textTransform");
   private static final BehaviorProperty y1 = new BehaviorProperty("style.textDecorationUnderline");
   private static final BehaviorProperty a0 = new BehaviorProperty("style.textEffectOutline");
   private static final BehaviorProperty d2 = new BehaviorProperty("style.textDecorationLineThrough");
   private static final BehaviorProperty d5 = new BehaviorProperty("style.sRotation");
   private static final BehaviorProperty s3 = new BehaviorProperty("imageData.cropTop");
   private static final BehaviorProperty p8 = new BehaviorProperty("imageData.cropBottom");
   private static final BehaviorProperty f2 = new BehaviorProperty("imageData.cropLeft");
   private static final BehaviorProperty i1 = new BehaviorProperty("imageData.cropRight");
   private static final BehaviorProperty e5 = new BehaviorProperty("imageData.gain");
   private static final BehaviorProperty b3 = new BehaviorProperty("imageData.blacklevel");
   private static final BehaviorProperty o0 = new BehaviorProperty("imageData.gamma");
   private static final BehaviorProperty z7 = new BehaviorProperty("imageData.grayscale");
   private static final BehaviorProperty v4 = new BehaviorProperty("imageData.chromakey");
   private static final BehaviorProperty u6 = new BehaviorProperty("fill.on");
   private static final BehaviorProperty t1 = new BehaviorProperty("fill.type");
   private static final BehaviorProperty a5 = new BehaviorProperty("fill.color");
   private static final BehaviorProperty h2 = new BehaviorProperty("fill.opacity");
   private static final BehaviorProperty v0 = new BehaviorProperty("fill.color2");
   private static final BehaviorProperty f0 = new BehaviorProperty("fill.method");
   private static final BehaviorProperty a3 = new BehaviorProperty("fill.opacity2");
   private static final BehaviorProperty p3 = new BehaviorProperty("fill.angle");
   private static final BehaviorProperty x9 = new BehaviorProperty("fill.focus");
   private static final BehaviorProperty y0 = new BehaviorProperty("fill.focusposition.x");
   private static final BehaviorProperty j9 = new BehaviorProperty("fill.focusposition.y");
   private static final BehaviorProperty z6 = new BehaviorProperty("fill.focussize.x");
   private static final BehaviorProperty e9 = new BehaviorProperty("fill.focussize.y");
   private static final BehaviorProperty o5 = new BehaviorProperty("stroke.on");
   private static final BehaviorProperty j8 = new BehaviorProperty("stroke.color");
   private static final BehaviorProperty w2 = new BehaviorProperty("stroke.weight");
   private static final BehaviorProperty s0 = new BehaviorProperty("stroke.opacity");
   private static final BehaviorProperty v8 = new BehaviorProperty("stroke.linestyle");
   private static final BehaviorProperty v3 = new BehaviorProperty("stroke.dashstyle");
   private static final BehaviorProperty g7 = new BehaviorProperty("stroke.filltype");
   private static final BehaviorProperty j4 = new BehaviorProperty("stroke.src");
   private static final BehaviorProperty i9 = new BehaviorProperty("stroke.color2");
   private static final BehaviorProperty f5 = new BehaviorProperty("stroke.imagesize.x");
   private static final BehaviorProperty j3 = new BehaviorProperty("stroke.imagesize.y");
   private static final BehaviorProperty n1 = new BehaviorProperty("stroke.startArrow");
   private static final BehaviorProperty p6 = new BehaviorProperty("stroke.endArrow");
   private static final BehaviorProperty d1 = new BehaviorProperty("stroke.startArrowWidth");
   private static final BehaviorProperty s4 = new BehaviorProperty("stroke.startArrowLength");
   private static final BehaviorProperty h6 = new BehaviorProperty("stroke.endArrowWidth");
   private static final BehaviorProperty y8 = new BehaviorProperty("stroke.endArrowLength");
   private static final BehaviorProperty c3 = new BehaviorProperty("shadow.on");
   private static final BehaviorProperty l4 = new BehaviorProperty("shadow.type");
   private static final BehaviorProperty i6 = new BehaviorProperty("shadow.color");
   private static final BehaviorProperty a7 = new BehaviorProperty("shadow.color2");
   private static final BehaviorProperty r8 = new BehaviorProperty("shadow.opacity");
   private static final BehaviorProperty r1 = new BehaviorProperty("shadow.offset.x");
   private static final BehaviorProperty y5 = new BehaviorProperty("shadow.offset.y");
   private static final BehaviorProperty k8 = new BehaviorProperty("shadow.offset2.x");
   private static final BehaviorProperty b5 = new BehaviorProperty("shadow.offset2.y");
   private static final BehaviorProperty u8 = new BehaviorProperty("shadow.origin.x");
   private static final BehaviorProperty w5 = new BehaviorProperty("shadow.origin.y");
   private static final BehaviorProperty q1 = new BehaviorProperty("shadow.matrix.xtox");
   private static final BehaviorProperty u5 = new BehaviorProperty("shadow.matrix.xtoy");
   private static final BehaviorProperty w8 = new BehaviorProperty("shadow.matrix.ytox");
   private static final BehaviorProperty c2 = new BehaviorProperty("shadow.matrix.ytoy");
   private static final BehaviorProperty t3 = new BehaviorProperty("shadow.matrix.perspectiveX");
   private static final BehaviorProperty u4 = new BehaviorProperty("shadow.matrix.perspectiveY");
   private static final BehaviorProperty s9 = new BehaviorProperty("skew.on");
   private static final BehaviorProperty p7 = new BehaviorProperty("skew.offset.x");
   private static final BehaviorProperty z5 = new BehaviorProperty("skew.offset.y");
   private static final BehaviorProperty h5 = new BehaviorProperty("skew.origin.x");
   private static final BehaviorProperty a8 = new BehaviorProperty("skew.origin.y");
   private static final BehaviorProperty f4 = new BehaviorProperty("skew.matrix.xtox");
   private static final BehaviorProperty y9 = new BehaviorProperty("skew.matrix.xtoy");
   private static final BehaviorProperty a1 = new BehaviorProperty("skew.matrix.ytox");
   private static final BehaviorProperty w3 = new BehaviorProperty("skew.matrix.ytoy");
   private static final BehaviorProperty i4 = new BehaviorProperty("skew.matrix.perspectiveX");
   private static final BehaviorProperty q3 = new BehaviorProperty("skew.matrix.perspectiveY");
   private static final BehaviorProperty q2 = new BehaviorProperty("extrusion.on");
   private static final BehaviorProperty p4 = new BehaviorProperty("extrusion.type");
   private static final BehaviorProperty d6 = new BehaviorProperty("extrusion.render");
   private static final BehaviorProperty y6 = new BehaviorProperty("extrusion.viewpointorigin.x");
   private static final BehaviorProperty n7 = new BehaviorProperty("extrusion.viewpointorigin.y");
   private static final BehaviorProperty l5 = new BehaviorProperty("extrusion.viewpoint.x");
   private static final BehaviorProperty u2 = new BehaviorProperty("extrusion.viewpoint.y");
   private static final BehaviorProperty d9 = new BehaviorProperty("extrusion.viewpoint.z");
   private static final BehaviorProperty c5 = new BehaviorProperty("extrusion.plane");
   private static final BehaviorProperty t5 = new BehaviorProperty("extrusion.skewangle");
   private static final BehaviorProperty j6 = new BehaviorProperty("extrusion.skewamt");
   private static final BehaviorProperty w9 = new BehaviorProperty("extrusion.backdepth");
   private static final BehaviorProperty m8 = new BehaviorProperty("extrusion.foredepth");
   private static final BehaviorProperty b9 = new BehaviorProperty("extrusion.orientation.x");
   private static final BehaviorProperty r6 = new BehaviorProperty("extrusion.orientation.y");
   private static final BehaviorProperty r5 = new BehaviorProperty("extrusion.orientation.z");
   private static final BehaviorProperty h9 = new BehaviorProperty("extrusion.orientationangle");
   private static final BehaviorProperty r7 = new BehaviorProperty("extrusion.color");
   private static final BehaviorProperty n9 = new BehaviorProperty("extrusion.rotationangle.x");
   private static final BehaviorProperty a2 = new BehaviorProperty("extrusion.rotationangle.y");
   private static final BehaviorProperty h1 = new BehaviorProperty("extrusion.lockrotationcenter");
   private static final BehaviorProperty t6 = new BehaviorProperty("extrusion.autorotationcenter");
   private static final BehaviorProperty v6 = new BehaviorProperty("extrusion.rotationcenter.x");
   private static final BehaviorProperty x0 = new BehaviorProperty("extrusion.rotationcenter.y");
   private static final BehaviorProperty o2 = new BehaviorProperty("extrusion.rotationcenter.z");
   private static final BehaviorProperty e0 = new BehaviorProperty("extrusion.colormode");

   @Override
   public final String getValue() {
      return this.k5;
   }

   @Override
   public final boolean isCustom() {
      return this.u3;
   }

   public static BehaviorProperty getPptX() {
      return a6;
   }

   public static BehaviorProperty getPptY() {
      return u9;
   }

   public static BehaviorProperty getPptW() {
      return h0;
   }

   public static BehaviorProperty getPptH() {
      return c8;
   }

   public static BehaviorProperty getPptC() {
      return t2;
   }

   public static BehaviorProperty getPptR() {
      return s7;
   }

   public static BehaviorProperty getXShear() {
      return x8;
   }

   public static BehaviorProperty getYShear() {
      return n3;
   }

   public static BehaviorProperty getImage() {
      return y4;
   }

   public static BehaviorProperty getScaleX() {
      return e2;
   }

   public static BehaviorProperty getScaleY() {
      return t9;
   }

   public static BehaviorProperty getR() {
      return z1;
   }

   public static BehaviorProperty getFillColor() {
      return t4;
   }

   public static BehaviorProperty getStyleOpacity() {
      return q0;
   }

   public static BehaviorProperty getStyleRotation() {
      return z3;
   }

   public static BehaviorProperty getStyleVisibility() {
      return m1;
   }

   public static BehaviorProperty getStyleColor() {
      return k7;
   }

   public static BehaviorProperty getStyleFontSize() {
      return m3;
   }

   public static BehaviorProperty getStyleFontWeight() {
      return z8;
   }

   public static BehaviorProperty getStyleFontStyle() {
      return j5;
   }

   public static BehaviorProperty getStyleFontFamily() {
      return w1;
   }

   public static BehaviorProperty getStyleTextEffectEmboss() {
      return r4;
   }

   public static BehaviorProperty getStyleTextShadow() {
      return c4;
   }

   public static BehaviorProperty getStyleTextTransform() {
      return y2;
   }

   public static BehaviorProperty getStyleTextDecorationUnderline() {
      return y1;
   }

   public static BehaviorProperty getStyleTextEffectOutline() {
      return a0;
   }

   public static BehaviorProperty getStyleTextDecorationLineThrough() {
      return d2;
   }

   public static BehaviorProperty getStyleSRotation() {
      return d5;
   }

   public static BehaviorProperty getImageDataCropTop() {
      return s3;
   }

   public static BehaviorProperty getImageDataCropBottom() {
      return p8;
   }

   public static BehaviorProperty getImageDataCropLeft() {
      return f2;
   }

   public static BehaviorProperty getImageDataCropRight() {
      return i1;
   }

   public static BehaviorProperty getImageDataGain() {
      return e5;
   }

   public static BehaviorProperty getImageDataBlacklevel() {
      return b3;
   }

   public static BehaviorProperty getImageDataGamma() {
      return o0;
   }

   public static BehaviorProperty getImageDataGrayscale() {
      return z7;
   }

   public static BehaviorProperty getImageDataChromakey() {
      return v4;
   }

   public static BehaviorProperty getFillOn() {
      return u6;
   }

   public static BehaviorProperty getFillType() {
      return t1;
   }

   public static BehaviorProperty getFill_Color() {
      return a5;
   }

   public static BehaviorProperty getFillOpacity() {
      return h2;
   }

   public static BehaviorProperty getFillColor2() {
      return v0;
   }

   public static BehaviorProperty getFillMethod() {
      return f0;
   }

   public static BehaviorProperty getFillOpacity2() {
      return a3;
   }

   public static BehaviorProperty getFillAngle() {
      return p3;
   }

   public static BehaviorProperty getFillFocus() {
      return x9;
   }

   public static BehaviorProperty getFillFocusPositionX() {
      return y0;
   }

   public static BehaviorProperty getFillFocusPositionY() {
      return j9;
   }

   public static BehaviorProperty getFillFocusSizeX() {
      return z6;
   }

   public static BehaviorProperty getFillFocusSizeY() {
      return e9;
   }

   public static BehaviorProperty getStrokeOn() {
      return o5;
   }

   public static BehaviorProperty getStrokeColor() {
      return j8;
   }

   public static BehaviorProperty getStrokeWeight() {
      return w2;
   }

   public static BehaviorProperty getStrokeOpacity() {
      return s0;
   }

   public static BehaviorProperty getStrokeLineStyle() {
      return v8;
   }

   public static BehaviorProperty getStrokeDashStyle() {
      return v3;
   }

   public static BehaviorProperty getStrokeFillType() {
      return g7;
   }

   public static BehaviorProperty getStrokeSrc() {
      return j4;
   }

   public static BehaviorProperty getStrokeColor2() {
      return i9;
   }

   public static BehaviorProperty getStrokeImageSizeX() {
      return f5;
   }

   public static BehaviorProperty getStrokeImageSizeY() {
      return j3;
   }

   public static BehaviorProperty getStrokeStartArrow() {
      return n1;
   }

   public static BehaviorProperty getStrokeEndArrow() {
      return p6;
   }

   public static BehaviorProperty getStrokeStartArrowWidth() {
      return d1;
   }

   public static BehaviorProperty getStrokeStartArrowLength() {
      return s4;
   }

   public static BehaviorProperty getStrokeEndArrowWidth() {
      return h6;
   }

   public static BehaviorProperty getStrokeEndArrowLength() {
      return y8;
   }

   public static BehaviorProperty getShadowOn() {
      return c3;
   }

   public static BehaviorProperty getShadowType() {
      return l4;
   }

   public static BehaviorProperty getShadowColor() {
      return i6;
   }

   public static BehaviorProperty getShadowColor2() {
      return a7;
   }

   public static BehaviorProperty getShadowOpacity() {
      return r8;
   }

   public static BehaviorProperty getShadowOffsetX() {
      return r1;
   }

   public static BehaviorProperty getShadowOffsetY() {
      return y5;
   }

   public static BehaviorProperty getShadowOffset2X() {
      return k8;
   }

   public static BehaviorProperty getShadowOffset2Y() {
      return b5;
   }

   public static BehaviorProperty getShadowOriginX() {
      return u8;
   }

   public static BehaviorProperty getShadowOriginY() {
      return w5;
   }

   public static BehaviorProperty getShadowMatrixXtoX() {
      return q1;
   }

   public static BehaviorProperty getShadowMatrixXtoY() {
      return u5;
   }

   public static BehaviorProperty getShadowMatrixYtoX() {
      return w8;
   }

   public static BehaviorProperty getShadowMatrixYtoY() {
      return c2;
   }

   public static BehaviorProperty getShadowMatrixPerspectiveX() {
      return t3;
   }

   public static BehaviorProperty getShadowMatrixPerspectiveY() {
      return u4;
   }

   public static BehaviorProperty getSkewOn() {
      return s9;
   }

   public static BehaviorProperty getSkewOffsetX() {
      return p7;
   }

   public static BehaviorProperty getSkewOffsetY() {
      return z5;
   }

   public static BehaviorProperty getSkewOriginX() {
      return h5;
   }

   public static BehaviorProperty getSkewOriginY() {
      return a8;
   }

   public static BehaviorProperty getSkewMatrixXtoX() {
      return f4;
   }

   public static BehaviorProperty getSkewMatrixXtoY() {
      return y9;
   }

   public static BehaviorProperty getSkewMatrixYtoX() {
      return a1;
   }

   public static BehaviorProperty getSkewMatrixYtoY() {
      return w3;
   }

   public static BehaviorProperty getSkewMatrixPerspectiveX() {
      return i4;
   }

   public static BehaviorProperty getSkewMatrixPerspectiveY() {
      return q3;
   }

   public static BehaviorProperty getExtrusionOn() {
      return q2;
   }

   public static BehaviorProperty getExtrusionType() {
      return p4;
   }

   public static BehaviorProperty getExtrusionRender() {
      return d6;
   }

   public static BehaviorProperty getExtrusionViewPointOriginX() {
      return y6;
   }

   public static BehaviorProperty getExtrusionViewPointOriginY() {
      return n7;
   }

   public static BehaviorProperty getExtrusionViewPointX() {
      return l5;
   }

   public static BehaviorProperty getExtrusionViewPointY() {
      return u2;
   }

   public static BehaviorProperty getExtrusionViewPointZ() {
      return d9;
   }

   public static BehaviorProperty getExtrusionPlane() {
      return c5;
   }

   public static BehaviorProperty getExtrusionSkewAngle() {
      return t5;
   }

   public static BehaviorProperty getExtrusionSkewAmt() {
      return j6;
   }

   public static BehaviorProperty getExtrusionBackDepth() {
      return w9;
   }

   public static BehaviorProperty getExtrusionForeDepth() {
      return m8;
   }

   public static BehaviorProperty getExtrusionOrientationX() {
      return b9;
   }

   public static BehaviorProperty getExtrusionOrientationY() {
      return r6;
   }

   public static BehaviorProperty getExtrusionOrientationZ() {
      return r5;
   }

   public static BehaviorProperty getExtrusionOrientationAngle() {
      return h9;
   }

   public static BehaviorProperty getExtrusionColor() {
      return r7;
   }

   public static BehaviorProperty getExtrusionRotationAngleX() {
      return n9;
   }

   public static BehaviorProperty getExtrusionRotationAngleY() {
      return a2;
   }

   public static BehaviorProperty getExtrusionLockRotationCenter() {
      return h1;
   }

   public static BehaviorProperty getExtrusionAutoRotationCenter() {
      return t6;
   }

   public static BehaviorProperty getExtrusionRotationCenterX() {
      return v6;
   }

   public static BehaviorProperty getExtrusionRotationCenterY() {
      return x0;
   }

   public static BehaviorProperty getExtrusionRotationCenterZ() {
      return o2;
   }

   public static BehaviorProperty getExtrusionColorMode() {
      return e0;
   }

   protected final boolean equals(BehaviorProperty other) {
      return com.aspose.slides.ms.System.d1.a6(this.k5, other.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.equals((BehaviorProperty)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.k5 != null ? this.k5.hashCode() : 0;
   }

   public static BehaviorProperty getOrCreateByValue(String propertyValue) {
      String var1 = com.aspose.slides.ms.System.d1.l6(propertyValue);
      return n5.containsKey(var1) ? n5.get_Item(var1) : new BehaviorProperty(var1, true);
   }

   private BehaviorProperty(String value) {
      this(value, false);
   }

   private BehaviorProperty(String value, boolean isCustom) {
      this.k5 = value;
      this.u3 = isCustom;
      synchronized (l6) {
         if (!n5.containsKey(value)) {
            n5.addItem(value, this);
         }
      }
   }
}
