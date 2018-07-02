from django.conf.urls import url
from . import views

urlpatterns = [
    url(r'^$', views.hello_world, name='hello_world'),
    url(r'^template/$', views.hello_template, name='hello_template'),
    url(r'^if/$', views.hello_if, name='hello_if'),
    url(r'^for/$', views.hello_for, name='hello_for'),
    url(r'^get/$', views.hello_get_query, name='hello_get_query'),
    url(r'^forms/$', views.hello_forms, name='hello_forms'),
    url(r'^form_samples/$', views.hello_forms2, name='hello_forms2'),  # 追加する
    url(r'^models/$', views.hello_models, name='hello_models'),  # 追加する
]